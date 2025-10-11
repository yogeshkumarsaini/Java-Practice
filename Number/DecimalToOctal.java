package Number;
import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        getOctal(a);
        sc.close();
    }
    public static void getOctal(int n){
        String octal="";
        while(n>0){
            int rem = n%8;
            octal=rem+octal;
            n=n/8;
        }
        System.out.println(octal);
    }
}
