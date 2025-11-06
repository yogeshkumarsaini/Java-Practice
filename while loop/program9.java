import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int count=0;
        int i=2;
        while(i<=a/2){
           if(a%i==0){
            count++;
           }
            i++;
        }
        if(count==0){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }

    }
}
