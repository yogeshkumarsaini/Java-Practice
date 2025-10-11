package Number;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the binary number");
        int a= sc.nextInt();
        getDecimal(a);
        sc.close();
    }
    public static void getDecimal(int n){
        int a=n;  int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        int x=count-1;  int dec=0;
        while(a>0){
            int rem = a%10;
            dec=dec+(int)(Math.pow(2, x))*rem;
            a=a/10; x--;
        }
        System.out.println("Decimal number is :"+dec);
    }
}
