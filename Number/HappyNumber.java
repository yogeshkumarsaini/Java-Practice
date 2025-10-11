package Number;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
       if(checkHappy(a)){
        System.out.println("It is a happy number");
       }
       else{
        System.out.println("It is not a happy number");
       }
       sc.close();
    }
    public static boolean checkHappy(int n){
        while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				sum=sum+rem*rem;
				n=n/10;
			}
			n=sum;
		}
		return n==1 || n==7;
        
    }
}
