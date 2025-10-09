package Array;

import java.util.Scanner;

public class ReverseArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a =new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        reverseAndPrintArrayElements(a);
        sc.close();
    }
    public static void reverseAndPrintArrayElements(int[] a){
        for(int i=0;i<a.length;i++){
           int reversed= reverseElement(a[i]);
            System.out.print(reversed+" ");
        }
    }
    public static int reverseElement(int n){
        int result=0;
        while (n>0) {
            int rem = n%10;
            result=result*10+rem;
            n=n/10;
        }
        return result;
    }
}
