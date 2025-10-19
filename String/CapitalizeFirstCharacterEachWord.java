package String;
// WAJP to take a String input and capitalize the first character of each word
import java.util.Scanner;

public class CapitalizeFirstCharacterEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        Capitalize(s);
        sc.close();
    }
    public static void Capitalize(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(i==0 && p!=' ' ||p!=' ' && s.charAt(i-1)==' '){
                result=result+(p+"").toUpperCase();
            }
            else{
                result=result+p;
            }
        }
        System.out.println(result);
    }
}
