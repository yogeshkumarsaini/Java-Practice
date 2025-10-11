package Number;
import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        getHexadecimal(a);
        sc.close();
    }
    public static void getHexadecimal(int n){
        String hexadecimal="";
        while(n>0){
            int rem=n%16;
            if(rem<=9)
                hexadecimal=rem+hexadecimal;
            else {
                hexadecimal=(char)(rem+55)+hexadecimal;
            }
            n=n/16;
        }
        System.out.println(hexadecimal);
    }
}
