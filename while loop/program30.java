
import java.util.Scanner;
public class program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int sum=0;
        int i =1;
        int x=9;
        while(i<=n){
            sum=sum+x;
            x=x*10+9;
            i++;
       }
       System.out.println(sum);
    }
}
