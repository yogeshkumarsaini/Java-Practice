package Array;

import java.util.Scanner;

public class SortHalfAscendingAndDescending {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a =new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        getSort(a);
        sc.close();
    }
    public static void getSort(int[] a){
        int half =a.length/2;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<half-1;j++){
                if(a[j]>a[j+1]){
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                }
            }
            for(int j=half;j<a.length-1;j++){
                if(a[j]<a[j+1]){
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                }
            }
            
        }
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
