package Number;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int a= sc.nextInt();
        System.out.println("Enter the number 2");
        int b= sc.nextInt();
        swap(a,b);
        sc.close();
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("Swapped a is: "+a);
        System.out.println("Swapped b is: "+b);
    }
}
