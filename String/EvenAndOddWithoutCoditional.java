package String;
// WAJP to print number is even or odd without using if else/conditional statements.

import java.util.Scanner;

public class EvenAndOddWithoutCoditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        String[] s={"Even","Odd"};
        System.out.println(s[a%2]);
        sc.close();
    }
}
