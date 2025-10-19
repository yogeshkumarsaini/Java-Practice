package String;
/* WAJP to take a String input and print the sum of all the numeric characters in the String */
import java.util.Scanner;

public class SumNumericCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        getSum(s);
        sc.close();
    }
    public static void getSum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(p>=48 && p<=57){
                sum=sum+p-48;
            }
        }
        System.out.println("Sum of the numeric character is :"+sum);
    }
}
