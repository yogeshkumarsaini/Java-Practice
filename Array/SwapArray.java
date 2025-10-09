package Array;
import java.util.Scanner;
public class SwapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the element of Array");
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            System.out.println("Element in the index: "+(i+1));
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the swap index 1 is: ");
        int b=sc.nextInt();
        System.out.println("Enter the swap index 2 is: ");
        int c= sc.nextInt();
        getSwap(a,b,c);
        sc.close();
    }
    public static void getSwap(int[] a, int b, int c){
        if (b >= 0 && b < a.length && c >= 0 && c < a.length){
            int temp=a[b];
            a[b]=a[c];
            a[c]=temp;
        }
        else{
            System.out.println("Invalid index provided.");
        }
        System.out.println("----------Swapped Array--------------");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
