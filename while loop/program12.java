import java.util.Scanner;
public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        while(a>0){
            int b =a %10;
            if(b>=5){
                System.out.println(b);
            }
            a=a/10;
        }

    }
}
