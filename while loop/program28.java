import java.util.Scanner;
public class program28 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the number: ");  
      int a = sc.nextInt();
      int i=1;
     
      while(i<=a){
        int j=1;
        while(j<=10){
          System.out.printf("%d x %d = %d\n", i, j, i * j);
          j++;
        }
        System.out.println("-----------------------------------------");
        i++;
      }
      
    }
}
