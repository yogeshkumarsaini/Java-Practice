package Number;
import java.util.Scanner;
public class BiggestAndSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        findDigit(a);
		sc.close();
    }
    public static void findDigit(int n){
        int b=n;
		int biggest=0;		int smallest=9;
		while(n>0){
			int rem=n%10;
			if(rem>biggest)
				biggest=rem;
			if(rem<smallest)
				smallest=rem;
		n=n/10;
		}
		if(b!=0) {
		System.out.println("The Biggest Digit is: "+biggest);	
		System.out.println("The Smallest Digit is: "+smallest);
		}
		else
		{
			System.out.println("There is no Biggest or smallest");
		}
	}
    
}
