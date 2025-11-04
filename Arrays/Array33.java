package Array;

import java.util.Scanner;

// Binary Searching
// WAJP to find out whether the user enterd element is present in given Array with the help of binary Search
// with the help of method
public class Array33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the which elements you want to  search in Array: ");
        int a = sc.nextInt();
        if(searchArray(arr,a)==-1){
            System.out.println("Elements is not present.");
        }
        else{
            System.out.println("Elements is present.");
        }
        
    }
    public static int searchArray(int[] arr,int a){
        int s = 0;
        int end = arr.length-1;
        while(s<=end){
            int mid = (s+end)/2;
            if(arr[mid]==a){
                return mid;
            }
            else if(a<arr[mid]){
                end =mid-1;
            }
            else if(a>arr[mid]){
               s=mid+1;
            }
        }
        return -1;
    }
}
