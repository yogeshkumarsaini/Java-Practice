package String;
// WAJP to take a String input and convert all the lowercase charcater to uppercase.
import java.util.Scanner;

public class ConvertLowerCharacterToUpperCharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println(s.toUpperCase());
        sc.close();
    }
    
}
