package Array;
// the count/frequency of a particular Character in an char array
import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        System.out.println("---------------------------------");
        
        char[] arr = new char[x];

        for(int i=0; i<x; i++){
            arr[i]  = sc.next().charAt(0);
        }
        System.out.println("---------------------------------");
        // System.out.println("Enter the element to check the frequency of an character in array:");
        // char n = sc.next().charAt(0);
        // int count = 0;

        // for(int i=0; i<arr.length; i++){
        //     if(n == arr[i]){
        //         count++;
        //     }
        // }
        // System.out.println("Frequency of a particular character in array: "+count);

         System.out.println("Count/Frequency of each elements in char array : ");
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
