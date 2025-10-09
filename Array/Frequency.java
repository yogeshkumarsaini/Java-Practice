package Array;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =sc.nextInt();
        System.out.println("Enter the element of array");
        int[] a = new int[n];
        for(int i=0; i<a.length;i++){
            a[i] =sc.nextInt();
        }
        checkFrequency(a);
        sc.close();
    }
    public static void checkFrequency(int[] a){
        int n =a.length-1;
        for(int i=0; i<=n;i++){
            int count=1;
            for(int j=i+1; j<=n;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    j--;
                    n--;
                }
            }
            System.out.println("Frequency of "+a[i]+" are: "+count);
        }
    }
}
