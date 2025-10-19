package String;
/* WAJP to take a String input and count all numeric characters in the String */
import java.util.Scanner;
public class CountNumericCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String a= sc.nextLine();
        checknumeric(a);
        sc.close();
    }
    public static void checknumeric(String a){
        int count =0;
        for(int i=0;i<a.length();i++){
            char p=a.charAt(i);
            if(p>=48 && p<=57)
                count++;
        }
        System.out.println("Numeric Character in the string are: "+count);
    }
}