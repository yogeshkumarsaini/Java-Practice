package Array;

import java.util.Scanner;

// sum of array elements with the help of methods and for each loop
public class Array31 {
   static Scanner sc = new Scanner(System.in);
    
    public static int[] CreateArray(){
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of Arrays:");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        return arr;
    }
    public static int Sum(int[] arr){
        for(int k:arr){
            System.out.print(k+" ");

        }
        System.out.println();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = CreateArray();
       System.out.println("Sum of Array Element is: "+Sum(arr)); 
      // System.out.println("Sum of Array Elemnts is: "+Sum(CreateArray()));
    }
}
