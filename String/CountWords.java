package String;
// WAJP to take a String input and count total number of words in the String.
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        getCountWord(s);
        sc.close();
    }
    public static void getCountWord(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(i==0 && s.charAt(i)!=' ' || s.charAt(i)!=' '&& s.charAt(i-1)==' '){
                count++;
            }
        }
        System.out.println("Total word in the string are: "+count);
    }
}
