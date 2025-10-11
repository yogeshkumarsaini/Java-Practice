package Number;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int a= sc.nextInt();
        getBinary(a);
        sc.close();
    }
    public static void getBinary(int n){
        String result="";
        while(n>0){
            int rem=n%2;
            result=rem+result;
            n=n/2;
        }
        System.out.println("Binary number is: "+result);
    }
}
