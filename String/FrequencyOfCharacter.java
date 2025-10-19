package String;
// WAJP to print the frequency of each charcters in the String.
import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        checkFrequency(s);
        sc.close();
    }
    public static void checkFrequency(String s){
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
            System.out.println("Frequency of the Charcater in string: "+p+" is: "+count+" times");
        }
    }
}
