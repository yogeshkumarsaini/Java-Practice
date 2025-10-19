package String;
/*WAJP for below requirements:
 * Input: mohan and sohan is here
 * Output: nahom dna nahos era ereh
 */
import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        getReverseEachWord(s);
        sc.close();
    }
    public static void getReverseEachWord(String s){
        String[] k=s.split(" ");
        for(int i=0;i<k.length;i++){
            String p=k[i];
            for(int j=p.length()-1;j>=0;j--){
                System.out.print(p.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
