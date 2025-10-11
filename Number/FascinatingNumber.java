package Number;
import java.util.Scanner;
public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        if(checkFascinating(a))
            System.out.println("It is a Fascinating Number");

        else
            System.out.println("It is not a Fascinating Number");
        sc.close();
    }
    public static boolean checkFascinating(int n){
        String s1=n+""+n*2+n*3;
		for(char c='1';c<='9';c++)
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(c==s1.charAt(i))
					count++;
			}
			if(count==0 || count>1)
				return false;
		}
		return true;
    }
}
