package Number;
import java.util.Scanner;
public class OctalToDecimal{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Octal Number");
   int a= sc.nextInt();
   getDecimal(a);
   sc.close();
 }
 public static void getDecimal(int n){
   int dec=0; 
   int comp=1;
   while(n>0){
      int rem=n%10;
      dec=dec+rem*comp;
      comp=comp*8;
      n=n/10;
   }
   System.out.println("Decimal Number is :"+dec);
 }
}