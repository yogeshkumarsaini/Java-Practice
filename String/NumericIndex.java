package String;
/* WAJP to take a String input and print all the indexes where numeric charcters are present in the String */
import java.util.Scanner;

public class NumericIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        getNumericIndex(s);
        sc.close();
    }
    public static void getNumericIndex(String s){
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(p>='0' && p<='9'){
                System.out.println("Numeric character "+p+" at the index are: "+i);
            }
        }
    }
}
