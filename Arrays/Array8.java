package Array;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        System.out.println("-------------------");
        int arr[] = new int[x];
        for(int i=0; i<x; i++){
            arr[i]  = sc.nextInt();
        }
         System.out.println("-----------Sum of All the elements in array---------------------");
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
         System.out.println(sum);
        
    }
}
