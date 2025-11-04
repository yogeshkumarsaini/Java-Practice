package Array;
import java.util.Scanner;

// WAJP to find out the second smallest element in int type of array
public class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        int arr[] = new int[x];
        
        for(int i=0; i<x; i++){
            arr[i]  = sc.nextInt();
        }
        int fmin =arr[0];
        int smin =arr[1];
        int tmin =arr[2];
         System.out.println("--------------------------------");
        for(int i=0;i<arr.length;i++){
            if(arr[i] < fmin){
                tmin=smin;
                smin=fmin;            
                fmin=arr[i];
                
            }
            else if(arr[i] < smin && arr[i] !=fmin ){
                tmin=smin;
                smin=arr[i];
                
            } 
            else if(arr[i] < tmin &&  arr[i] !=fmin  && arr[i] !=smin){
            
                tmin = arr[i];
            }         
        }
       System.out.println("First smallest number in Array: "+fmin);
        System.out.println("Second smallest number in Array: "+smin);
        System.out.println("Third smallest number in Array: "+tmin);

    }
}
