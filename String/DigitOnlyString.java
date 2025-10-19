package String;
// WAJP to check if a String contains only digits.
import java.util.Scanner;

public class DigitOnlyString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        if(checkDigit(s))
            System.out.println("All charcter in the string are digits");
        else
            System.out.println("All the charcter in the string are not digits");
        sc.close();
    }
    public static boolean checkDigit(String s){
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(!(p>='0' && p<='9')){
                return false;
            }
        }
        return true;
    }
}
