package String;
/* WAJP to take a String input and print all the indexes where space characters are present in the String */
import java.util.Scanner;

public class SpaceIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.nextLine();
        getSpaceIndex(s);
        sc.close();
    }
    public static void getSpaceIndex(String s){
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(p==' ')
                System.out.println("Space character at the index are: "+i);
        }
    }
}
