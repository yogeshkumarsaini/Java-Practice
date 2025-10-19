package String;
// WAJP to print the character which is appeared for the maximum times in the String
import java.util.Scanner;

public class MaxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        MaxFrequencyChar(s);
        sc.close();
    }
    public static void MaxFrequencyChar(String s){
        int maxCount=0; char target=' ';
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
            if(maxCount<count){
                maxCount=count;
                target=p;
            }
        }
        System.out.println(target+" has appeared "+maxCount+" times");
        
    }
}
