package Array;

import java.util.Scanner;

// Insertion an element in given Array
public class Array27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int x= sc.nextInt();
        System.out.println("--------------------");
        int[] arr = new int[x];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<x;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("-----------------");
        for(int i=0;i<x;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("-------------------------------");
        System.out.println("Enter the new element you want to insert: ");
        int n=sc.nextInt();
        System.out.println("Enter the index which you want to insert:");
        int a=sc.nextInt();
        int[] arr1 = new int[x+1];
        for(int i=0;i<arr1.length;i++){
            if(i<a){
               arr1[i]= arr[i]; 
            }
           else if(i==a){
                arr1[i]=n;
            }
            else{
                arr1[i]=arr[i-1];
            }
       
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

        
    }
}
