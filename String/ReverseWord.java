package String;
/*WAJP for below requirements:
 * Input: mohan and sohan are here
 * Output: here are sohan and mohan
 */
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        getReverse(s);
        sc.close();
    }
    public static void getReverse(String s){
        String[] k=s.split(" ");
        for(int i=k.length-1;i>=0;i--){
            System.out.print(k[i]+" ");
        }
        
    }
}
