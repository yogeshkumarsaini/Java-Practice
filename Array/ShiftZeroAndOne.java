package Array;

import java.util.Scanner;

public class ShiftZeroAndOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the Array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        getShift(a);
        sc.close();
    }
    public static void getShift(int[] a){
        int[] b= new int[a.length];
        int count=0;
        for(int i=0; i<a.length;i++){
            if(a[i]==1){
                count++;
            }
        }
        for(int i=b.length-1;count>0;i--){
            b[i]=1;
            count--;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
