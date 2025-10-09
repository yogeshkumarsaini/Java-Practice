package Array;

import java.util.Scanner;

public class RotatedRigthFromkPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the kth position to rotate right the array");
        int k=sc.nextInt();
        rotateRight(a,k);
        sc.close();

    }
    public static void rotateRight(int[] a, int k){
        int n= a.length;
        for(int j=0;j<n;j++){
            int x=a[a.length-1];
            for(int i=a.length-k;i>=0;i++){
                a[i+1]=a[i];
            }
            a[0]=x;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
