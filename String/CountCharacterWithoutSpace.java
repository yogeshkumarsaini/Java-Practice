package String;
/*WAJP to take a String input and count all the charcaters without spaces in the string */
import java.util.Scanner;

public class CountCharacterWithoutSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        countCharacter(s);
        sc.close();
    }
    public static void countCharacter(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char p =s.charAt(i);
            if(p!=' '){
                count++;
            }
        }
        System.out.println("Total character of the string are: "+count);
    }
}
