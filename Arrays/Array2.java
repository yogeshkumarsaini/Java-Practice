package Array;

import java.util.Scanner;

public class Array2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        double arr[] = new double[x];
        for(int i=0; i<x; i++){
            arr[i]  = sc.nextDouble();
        }
         System.out.println("--------------------------------");
        for(int i=0;i<arr.length;i++){
           
            System.out.println(arr[i]);
        }
    }   
}
