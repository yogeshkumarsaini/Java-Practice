package Array;
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the element of Array are: ");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Sum of the Array Element are: "+getSum(a));
        System.out.println("Average of the Array Element are: "+getSum(a)/n);
        sc.close();
    }
    public static int getSum(int[] a){
        int sum=0;
        for(int i=0; i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
}
