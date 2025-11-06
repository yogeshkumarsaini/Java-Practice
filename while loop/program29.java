import java.util.Scanner;

public class program29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a =sc.nextInt();
        double sum =0.0;
        int i=1;
        while(i<=a){
            sum = sum+1.0/i;
            i++;
        }
        System.out.println("Sum of harmonic Series is: "+sum);
    }
}
