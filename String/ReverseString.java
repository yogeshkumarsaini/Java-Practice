package String;
// WAJP to take a String input and reverse the String
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.nextLine();
        getReverse(s);
        sc.close();
    }
    public static void getReverse(String s){
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            char p=s.charAt(i);
            a=a+p;
        }
        System.out.println("Reverse String are: "+a);
    }
}
