import java.util.Scanner;
public class program20 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int a = sc.nextInt();
      int sum = 0;
      int i=1;
      while(i<=a/2){
          if(a % i==0){
              sum = sum+i;
          }
          i++;
      }
      if(sum==a){
        System.out.println("It is a perfect number");
      }
      else{
        System.out.println("It is not a perfect number");
      } 
    }
}
