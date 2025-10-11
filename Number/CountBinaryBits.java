package Number;

import java.util.Scanner;

class CountBinaryBits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a=sc.nextInt();
        System.out.println("Total binary bits in "+a+" are: "+countBits(a));
		sc.close();
    }
    public static int countBits(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/2;
		}
		return count;	
	}
}