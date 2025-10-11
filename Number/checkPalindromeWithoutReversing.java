package Number;
import java.util.Scanner;
public class checkPalindromeWithoutReversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        if(checkPalindrome(a)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }
    public static boolean checkPalindrome(int n){
        int a=n;   int b=n;   int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        int x= count-1;
        int i=1;
        while(i<=count/2){
            int rem=a%10;
            int l=(int)(b/Math.pow(10, x))%10;
            if(rem!=l)
                return false;
            a=a/10;   x--;  i++;
        }

        return true;
    }
}
