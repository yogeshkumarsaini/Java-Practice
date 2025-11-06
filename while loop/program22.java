import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a =sc.nextInt(); 
        int sum=0; 
        while(a > 0){
          int b =a%10;
          if(b%2==0){
            sum=sum+b;  
          }
          a=a/10;
        } 
        System.out.println(sum);
    }
}
