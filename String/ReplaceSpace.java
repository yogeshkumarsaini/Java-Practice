package String;
/* WAJP to take a String input and replace all the space characters from _ in the string */
import java.util.Scanner;

public class ReplaceSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
       String a=s.replace(' ', '_');
        System.out.println(a);
        sc.close();
    }
}
