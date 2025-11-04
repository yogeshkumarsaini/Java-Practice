package Array;

import java.util.Scanner;

public class Array34 {
   
 public static int main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] arr = {12,64,97,45,1,4,56,34,28,31};
    System.out.println("Enter the which element you want to Search it in given Array: ");
    int a = sc.nextInt();

    int start=0;
    int end= arr.length-1;

    while(start<=end){
        int mid = (start+end)/2;

        if(arr[mid]==2){
            return mid;
        }
        else if(a<arr[mid]){
            end=mid-1;
        }
        else if(a>arr[mid]){
            start=mid+1;
        }
    }

    return -1;
 }
}
