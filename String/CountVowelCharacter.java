package String;
/* WAJP to take a String input and count all the vowel characters in the String */
import java.util.Scanner;

public class CountVowelCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        countVowel(s);
        sc.close();
    }
    public static void countVowel(String s){
        int count=0;
        for(int i=0; i<s.length();i++){
            char p=s.charAt(i);
            if(p=='A' || p=='E' || p=='I' ||p=='O' || p=='U'||p=='a'||p=='e'||p=='i'||p=='o'||p=='u')
                count++;
        }
        System.out.println("Total count of vowel character in the string are: "+count);
    }
}
