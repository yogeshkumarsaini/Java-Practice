import java.util.Scanner;
public class program8 {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number:");
    int a =sc.nextInt();
    int count=0;
    int i=1;
    while(i<=a/2){
        if(a%i==0){
            count++;
        }
        i++;
    }
    System.out.println(count);
   } 
}
