import java.util.Scanner;

public class DecimalToBinary {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    getbin(n);
   } 
   public static void getbin(int n){
    String bin=" ";
    while(n>0){
        int rem=n%2;
        bin = rem+bin;
        n=n/2;
    }
    System.out.println("The Binary Nuumber is: "+bin);
   }
}
