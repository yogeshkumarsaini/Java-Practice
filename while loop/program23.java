import java.util.Scanner;

public class program23 {
  public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a = sc.nextInt();
        
    while (a > 0)
    {
      int b = a % 10;
      int c = 1;
           
      for (int i = 2; i <= b; i++) {
        c =c* i;
      }
            
    System.out.println("Factorial of " + b + " is " + c);
            
    a /= 10;
    }
  }  
}
