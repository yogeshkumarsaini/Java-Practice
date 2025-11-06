import java.util.Scanner;
public class program14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int a = sc.nextInt();
       int fact=1;
        int i=1;
        while(i<=a)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(a+ "! = "+fact);

    }
}
