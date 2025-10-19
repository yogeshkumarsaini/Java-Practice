package String;
// WAJP take a String input and print the index of first non-repeating character
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        System.out.println(getNonRepeating(s));
        sc.close();
    }
    public static String getNonRepeating(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            char p=s.charAt(i);
            int j;
            for(j=0;j<n;j++){
                if(i!=j && p==s.charAt(j))
                    break;              
            }
            if(n==j){
                return "The First Non-Repeating charcter is: "+p+ " and its index value: "+i;
            }
        }
        return "Non repeating charcter is not found";
    }
}

