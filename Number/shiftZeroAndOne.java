package Number;
import java.util.Scanner;
public class shiftZeroAndOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a= sc.nextInt();
        getResult(a);
        sc.close();
    }
    public static void getResult(int n){
        String result="";
        while(n>0){
            int rem=n%10;
                      
            if(rem==0){
                result=rem+result;
            }
            else if(rem==1)
            {
                result = result+rem;
            }
            n=n/10;
        }
        System.out.println(result);
    }
}
