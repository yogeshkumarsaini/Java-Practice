package Number;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(checkPerfect(a)==a)
            System.out.println("It is a perfect number");
        else
            System.out.println("It is not a perfect number");
        
        sc.close();
    }
    public static int checkPerfect(int n) {
        int sum=0;
        for(int i=1; i<=n/2;i++){
            if(n%i==0)
             sum=sum+i;
        }
        return sum;
    }
}
