package Array;

import java.util.Scanner;

public class SortHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        getSortHalf(a);
        sc.close();
    }
    public static void getSortHalf(int[] a){
        int n=a.length-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(a[i]>a[j]){
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        }
        int last=a.length-1;
        for(int j=0;j<a.length;j++){
            if(j<a.length/2)
                System.out.print(a[j]+" ");    
            else{
                System.out.print(a[last]+" ");
                last--;
            }
        }
    }
}
