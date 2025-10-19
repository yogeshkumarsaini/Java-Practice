package String;
// WAJP to take a String input and check whether the string is a Palindrome String or not
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        if(getPalindrome(s))
            System.out.println("It is a palindrome String");
        else
            System.out.println("It is not a palindrome String");        
        sc.close();
    }
    public static boolean getPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            char p=s.charAt(i);
            char t=s.charAt(n-1-i);
            if(p!=t)
                return false;
        }
        return true;
    }
}
