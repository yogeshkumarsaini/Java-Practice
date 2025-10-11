package Number;
import java.util.Scanner;
public class CountBits {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int a = sc.nextInt();
    getBinary(a);
    sc.close();
   } 

   public static void getBinary(int n){
    int count_0=0;
    int count_1=0;
    while(n>0){
        int rem=n%2;
        if(rem==1)
            count_1++;
        else
            count_0++; 
        n=n/2;
    }
    System.out.println("Total 0 Bits are: "+count_0);
    System.out.println("Total 1 Bits are: "+count_1);
   }
}
