package Array;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        System.out.println("-------------------");
        int arr[] = new int[x];
        for(int i=0; i<x; i++){
            arr[i]  = sc.nextInt();
        }
         System.out.println("--------------Product of all elements in array------------------");
        int product=1;
        for(int i=0; i<arr.length; i++){
             product=product*arr[i];
        }
         System.out.println(product);
        
    }
}
