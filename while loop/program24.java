import java.util.Scanner;

public class program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int sum=0;
        while (a > 0)
        {
            int b = a % 10;
            int c = 1;
           
            for (int i = 2; i <= b; i++) {
                c =c* i;
            }
            sum=sum+c;
        System.out.println("Factorial of " + b + " is " + c);
       
        a /= 10;
    }
    System.out.println("Sum of each factorial is: "+sum); 
    }
}



