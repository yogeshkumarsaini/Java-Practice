package Array;

import java.util.Scanner;

// WAJP to print the first occurrence of an element in the given array
public class Array17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int x = sc.nextInt();
        System.out.println("-------------------------------");
        System.out.println("Enter the elements of Array: ");
        int arr[] = new int[x];

        for(int i=0; i<x; i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println("---------------------------------");
        System.out.println("Enter the element which is Occur in array:");
        int n = sc.nextInt();
        int flag =-1;
        int i;
       for( i=0; i<arr.length; i++){
        if(arr[i] == n){
           flag++;
            break;

        }
       }
        
       if(flag >= 0){
        System.out.println("First Occurence is found: "+i);
       }
       else{
        System.out.println("Occurence is not found");
       }
    }
}
