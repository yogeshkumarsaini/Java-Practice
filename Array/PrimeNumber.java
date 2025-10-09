package Array;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the Element of Array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
		System.out.println("All Prime Numbers are: ");
		for(int x:a){
			if(checkPrime(x)){
				System.out.print(x+"  ");	count++;
			}
		}
		System.out.println("\nTotal Count is: "+count);
		sc.close();
	}
	public static boolean checkPrime(int n)
	{
		if(n<=1)
			return false;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					return false;
			}
		return true;	
		}
	}
}
