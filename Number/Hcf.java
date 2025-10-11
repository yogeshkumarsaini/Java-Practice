package Number;
import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2 number: ");
        int b = sc.nextInt();
        System.out.println("Enter the 3 number: ");
        int c = sc.nextInt();
        System.out.println(checkHcf(a, b, c));
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int checkHcf(int a, int b, int c) {
        int gcd_ab = gcd(a, b);
        int gcd_bc = gcd(b, c);
        int gcd_ca = gcd(c, a);

        int lcm_ab = (a * b) / gcd_ab;
        int lcm_bc = (b * c) / gcd_bc;
        int lcm_ca = (c * a) / gcd_ca;

        int hcf = lcm_ab;
        if (lcm_bc < hcf)
            hcf = lcm_bc;
        if (lcm_ca < hcf)
            hcf = lcm_ca;

        return hcf;
    }
}