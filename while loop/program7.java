import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int a =sc.nextInt();
        int i =1;
        while(i<=a-1){
            if(a%i==0 ){
                System.out.println(i);
            }
            i++;
        }
    }
}
