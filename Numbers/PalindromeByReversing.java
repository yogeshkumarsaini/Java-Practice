import java.util.Scanner;

public class PalindromeByReversing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if(checkPalindrome(n)){
            System.out.println("It is a Palindrom Number");
        }
        else{
            System.out.println("It is not a Plaindrome Number");
        }
        

    }
    public static boolean checkPalindrome(int n){
        int a=n;
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev=10*rev+rem;
            n=n/10;
        }
        if(rev==a){
            return true;
        }
        else{
            return false;
        }
    }

}
