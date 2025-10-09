package Array;

import java.util.Scanner;

public class InsertCertainPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a =new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the index to insert the element");
        int index=sc.nextInt();
        System.out.println("Enter the value of the element");
        int value= sc.nextInt();
        getInsert(a,index,value);
        sc.close();
    }
    public static void getInsert(int[] a, int index, int value ){
        int[] b= new int[a.length+1];
        b[index]=value;
        for(int i=0;i<a.length;i++){
            if(i<index)
                b[i]=a[i];
            else
                b[i+1]=a[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
