package Array;

import java.util.Scanner;

public class CompareElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        if(checkElement(a))
            System.out.println("Front element are same as back element  or true");
        else
            System.out.println("Front element are not same as back element or false");
        sc.close();
    }
    public static boolean checkElement(int[] a){
        int n = a.length;
        for(int i=0;i<a.length/2;i++){
            if(a[i]==a[n-1-i]){
                return false;
            }
        }
        return true;
    }
}
