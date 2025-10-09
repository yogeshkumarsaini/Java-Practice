package Array;

import java.util.Scanner;

public class SmallestAndSecondsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
        checkSmallestAndSecondsmallest(a);
        sc.close();
    }
    public static void checkSmallestAndSecondsmallest(int[] a){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=a[0];
        for(int i=0; i<a.length;i++){
            if(a[i]<smallest){
                secondSmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]<secondSmallest && a[i]!=smallest)
                secondSmallest=a[i];
        }
        System.out.println("Smallest element in the array are: "+smallest);
        if(secondSmallest!=Integer.MAX_VALUE){
            System.out.println("Second smallest element in the array are: "+secondSmallest);

        }
        else
            System.out.println("There is no second smallest element in the array");
    }
}
