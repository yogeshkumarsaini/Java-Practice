package Number;
import java.util.Scanner;
public class PrintRightToLeftDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a=sc.nextInt();
        getDigit(a);
        sc.close();
    }
    public static void getDigit(int n){
        while(n>0){
            int rem = n%10;
            System.out.print(rem+" ");
            n=n/10;
        }
    }

}
