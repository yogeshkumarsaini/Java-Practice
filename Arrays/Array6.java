package Array;

import java.util.Scanner;

public class Array6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        System.out.println("------------------------------------");
        int arr[] = new int[x];
        for(int i=0; i<x; i++){
            arr[i]  = sc.nextInt();
        }
         System.out.println("------------Odd Index Elements in Arrays--------------------");
        for(int i=0;i<arr.length;i++){
           if(i%2 == 0){
            System.out.println(arr[i]);
           }
            
        }
        
    }
}
