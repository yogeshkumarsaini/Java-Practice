package Array;

import java.util.Scanner;

public class Array7 {
    //WAJP to create an array of char type and store 6 user defined characters and print them only one by one
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char arr[] = new char[6];
        for(int i=0; i<6; i++){
            System.out.println("Enter the Char: ");
            arr[i]  = sc.next().charAt(0);
        }
         System.out.println("--------------------------------");
        for(int i=0;i<arr.length;i++){
           
            System.out.println(arr[i]);
        }
        
    }
}
