import java.util.Scanner;

public class program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int sum=0;
        int i =1;
        int x=1;
        while(i<=n){
            sum=sum+x;
            x=x*10+1;
            i++;
       }
       System.out.println(sum);
    }
}
