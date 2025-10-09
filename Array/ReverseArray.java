package Array;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the Array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        getReverse(a);
        sc.close();
    }
    public static void getReverse(int[] a){
        System.out.println("--------Reverse Array----------");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
