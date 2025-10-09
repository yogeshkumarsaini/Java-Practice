package Array;
import java.util.Scanner;
public class BiggestAndSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of Array are: ");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        getBiggestAndSmallest(a);
        sc.close();
    }
    public static void getBiggestAndSmallest(int[] a){
        if(a.length==1){
            System.out.println("Biggest and Smallest doesn't exits'");
        }
        else{
            int biggest =a[0];
			int smallest=a[0];
			for(int i=1;i<a.length;i++)
			{
				if(a[i]>biggest)
					biggest=a[i];
				else if(a[i]<smallest)
					smallest=a[i];
			}
			if(biggest==smallest)
				System.out.println("Biggest and smallest both are same: "+biggest);
			else
				System.out.println("Biggest is: "+biggest+" Smallest is: "+smallest);
            System.out.println("Difference between biggest and smallest are: "+(biggest-smallest));
        }
    }
}