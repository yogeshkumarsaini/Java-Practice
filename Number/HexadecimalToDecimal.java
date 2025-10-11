package Number;
import java.util.Scanner;
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hexadecimal number");
        String a=sc.next();
        System.out.println(getDecimal(a));
        sc.close();
    }
    public static String getDecimal(String n){
        int len=n.length();
        int comp=1;
        int dec=0;
        for(int i=len-1;i>=0;i--){
            char x =n.charAt(i);
            if(x>=48 && x<=57)
             dec=dec+(x-48)*comp;
            else if(x>='A' && x<='F')
             dec=dec+(x-55)*comp;
            else if(x>='a' && x<='f')
                dec =dec+(x-87)*comp;
            else
                return "The given number is not a valid hexadecimal number";
            comp=comp*16;
        }
        return "The decimal Number is: "+dec;
    }
}
