import java.util.Scanner;
public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        int pow=1;
        int i=1;
        while(i<=b)
        {
            pow=pow*a;
            i++;
        }
        System.out.println(a+ " to power "+ b +" is: " +pow);
    
    }
         
}
