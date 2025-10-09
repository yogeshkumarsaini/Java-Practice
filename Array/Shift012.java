package Array;

import java.util.Scanner;

public class Shift012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        getShift(a);
        sc.close();
    }
    public static void getShift(int[] a){
        int[] b= new int[a.length];
        int count_0=0;
        int count_2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count_0++;
            }
            else if(a[i]==2){
                count_2++;
            }
            b[i]=1;
        }
        int n=b.length-1;
        for(int i=0; i<b.length;i++){
            if(count_0>0){
                b[i]=0;
                count_0--;
            }
            else if(count_2>0){
                b[n]=2;
                count_2--;
                n--;
            }
            if(count_0==0 && count_2==0)
				break;
        }
        for(int i=0; i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }

}