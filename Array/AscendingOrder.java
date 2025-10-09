package Array;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        getAscending(a);
        sc.close();
    }
    public static void getAscending(int[] a){
        int n=a.length-1;
        for(int i=0;i<n;i++){
            int x=0;
            for(int j=i+1;j<=n;j++){
                if(a[i]>a[j]){
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                    x++;
                }
            }
            if(x==0)
                break;
        }
        for(int i=0; i<=n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
