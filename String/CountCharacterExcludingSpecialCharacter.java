package String;
// WAJP take a String input and count all the charcaters(excluding any special charcaters)
import java.util.Scanner;

public class CountCharacterExcludingSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        getCount(s);
        sc.close();
    }
    public static void getCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(p>='a' && p<='z' || p>='A' && p<='Z' ||p>='0' && p<='9'){
                count++;
            }
        }
        System.out.println("Total count of character excluding special character are: "+count);
    }
}
