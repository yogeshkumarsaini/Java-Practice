package Array;

import java.util.Scanner;

public class MaximumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n =sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a =new int[n];
        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Maximum product of two integer in a array are: "+getProduct(a)); 
        sc.close();   
    }
    public static int getProduct(int[] a){
        int biggest=a[0];
        int secondBiggest=Integer.MIN_VALUE;
        for(int i=0; i<a.length;i++){
            if(a[i]>biggest){
                secondBiggest=biggest;
                biggest=a[i];
            }
            else if(a[i]>secondBiggest && a[i]!=biggest){
                secondBiggest=a[i];
            }
        }
        int product_1=biggest*secondBiggest;

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
        int product_2=smallest*secondSmallest;

        return product_1>product_2?product_1:product_2;
    }
    

}
