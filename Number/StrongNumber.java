package Number;
import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(checkStrong(a)==a){
            System.out.println("It is a strong number");
        }
        else{
            System.out.println("It is not a strong number");
        }
        sc.close();
    }
    public static int checkStrong(int n){
        int b;
        int fact=1;
        int sum=0;
        while(n!=0){
            b=n%10;
            for(int i=1; i<=b;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
            fact=1;
        }
        return sum;
    }
}
