import java.util.Scanner;
public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a =sc.nextInt();
         int count=0;  
        while(a > 0){
          int b =a%10;
          if(b%2==0){
              count++;
          }
          a=a/10;
        } 
        System.out.println(count);
    }
}
