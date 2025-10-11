package Number;
import java.util.Scanner;
public class printLeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a = sc.nextInt();
        getShift(a);
		sc.close();
    }
    public static void getShift(int n){

        int a=n;		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		int x=count-1;
		while(x>=0)
		{
			int digit=(int)(a/Math.pow(10, x))%10;
			System.out.print(digit+"  ");
			x--;
		}
	}
    
}
