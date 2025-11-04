package Array;

import java.util.Scanner;

// WAJP to find out the second largest element in int type of array
public class Array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        System.out.println("---------------------------------");
        int arr[] = new int[x];
        
        for(int i=0; i<x; i++){
            arr[i]  = sc.nextInt();
        }
        
        int fmax =arr[0];
        int smax = arr[1];
        int tmax = arr[2];
        System.out.println("--------------------------------");
        for(int i=0;i<arr.length;i++){
            if( arr[i] > fmax){ 
                tmax=smax;
                smax=fmax;            
                fmax=arr[i];
                
            }
            else if(arr[i] > smax && arr[i] !=fmax  ){
                tmax = smax;
                smax=arr[i];
                
            }else if(arr[i] >tmax &&  arr[i] !=fmax  && arr[i] !=smax){
                tmax = arr[i];
            }
            
        }
        System.out.println("First largest number in Array: "+fmax);
        System.out.println("Second largest number in Array: "+smax);
        System.out.println("Third largest number in Array: "+tmax);
    }
}
