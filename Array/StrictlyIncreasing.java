package Array;

import java.util.Scanner;

public class StrictlyIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0; i<a.length;i++){
            a[i]= sc.nextInt();
        }
        if(checkStrictlyIncreasing(a))
            System.out.println("Array is strictly increasing");
        else
            System.out.println("Array is not strictly increasing");
        sc.close();
    }
    public static boolean checkStrictlyIncreasing(int[] a){
        int n=a.length-1;
        for(int i=0;i<n;i++){
            if(!(a[i+1]>a[i])){
                return false;
            }
        }
        return true;
    }
}
