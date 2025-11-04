package Array;

import java.util.Scanner;

//Deletion an element of an Array
public class Array28 {
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
        
        System.out.println("Enter the index which you want to delete:");
        int a=sc.nextInt();
        int[] arr1 = new int[x-1];
        for(int i=0;i<arr1.length;i++){
            if(i<a){
               arr1[i]= arr[i]; 
            }
           
            else{
                arr1[i]=arr[i+1];
            }
       
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        
    }
}
