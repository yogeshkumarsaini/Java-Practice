package String;
// WAJP to print all the character which is appeared only once in the string
import java.util.Scanner;

public class OnceFrequencyInCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        OnceFrequency(s);
        sc.close();
    }
    public static void OnceFrequency(String s){
        for(int i=0;i<s.length();i++){
            int count=1;
            char p=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(p==s.charAt(j)){
                    count++;
                   s= s.substring(0, j)+s.substring(j+1, s.length());
                   j--;
                }
            }
            if(count<=1){
                System.out.println(p+" has appeared once in the string "+count);
            }
        }
    }
}
