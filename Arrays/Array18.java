package Array;

import java.util.Scanner;

// the count/frequency of a particular element in an int array
public class Array18 {
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
        // System.out.println("Enter the element to check the frequency of an element in array:");
        // int n = sc.nextInt();
        // int count = 0;

        // for(int i=0; i<arr.length; i++){
        //     if(n == arr[i]){
        //         count++;
        //     }
        // }
        // System.out.println("Frequency of a particular element in array: "+count);
        System.out.println("Count/Frequency of each elements: ");
        boolean arr1[] = new boolean[x];
        for(int i=0;i<arr.length;i++){
            if(arr1[i]==false){
            int count=1;
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr1[j]= true;
                }
            }
            System.out.println(arr[i]+"  "+count);
            }
             
        
        }
       
    } 
}
