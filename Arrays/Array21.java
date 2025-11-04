package Array;

import java.util.Scanner;

// WAJP to print the last occurrence of an element in the given array
public class Array21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        System.out.println("---------------------------------");
        int arr[] = new int[x];

         for(int i=0; i<x; i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println("---------------------------------");
        System.out.println("Enter the element which is Occur in array:");
        int n = sc.nextInt();
        int i;
        int flag=0;
        for(i=arr.length-1;i>=0; i--){
            if(arr[i] == n){
             flag++;
             break;
            }
        }
        if(flag >= 0){
        System.out.println("Last Occurence is found: "+i);
       }
       else{
        System.out.println("Occurence is not found");
       }

    }
}
