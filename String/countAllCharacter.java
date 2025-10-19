package String;
/* WAJP to take a String input and count all the space charcaters, uppercase, lowercase, numeric, special charcters in the String  */
import java.util.Scanner;

public class countAllCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        countCharacter(s);
        sc.close();;
    }
    public static void countCharacter(String s){
        int countSpace=0;
        int countUpper=0;
        int countLower=0;
        int countNumeric=0;
        int countSpecial=0;

        for(int i=0; i<s.length();i++){
            char p=s.charAt(i);
            
            if(p==' '){
                countSpace++;
            }
            else if(p>='A' && p<='Z'){
                countUpper++;
            }
            else if(p>='a' && p<='z'){
                countLower++;
            }
            else if(p>='0' && p<='9'){
                countNumeric++;
            }
            else{
                countSpecial++;
            }
        }
        System.out.println("Total space character count in given string are: "+countSpace);
        System.out.println("Total upper character count in given string are: "+countUpper);
        System.out.println("Total lower character count in given string are: "+countLower);
        System.out.println("Total numeric character count in given string are: "+countNumeric);
        System.out.println("Total special character count in given string are: "+countSpecial);
    }
}
