package Array;

import java.util.Scanner;

public class RemoveCertainPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a =new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the index to remove in the array");
        int index = sc.nextInt();
        getRemove(a, index);
        sc.close();
    }
    public static void getRemove(int[] a, int index){
        int[] b = new int[a.length-1];
        for(int i=0;i<a.length;i++){
            if(i<index)
                b[i]=a[i];
            else if(i>index)
                b[i-1]=a[i];
        }
        for(int i=0; i<b.length;i++)
            System.out.print(b[i]+" ");
    }
}
