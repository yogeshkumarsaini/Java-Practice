package Array;
import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the Element of the Array are: ");
        int[]  a =new int[n];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        getThreeDigitNumber(a);
       sc.close();
    }
    public static void getThreeDigitNumber(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            int countDigit=0;
            int b=a[i];
            while(b>0){
              
                int rem=b%10;
                countDigit++;
                b=b/10;
            }
            if(countDigit>=3){
                System.out.println("Three digit element in the array are: "+a[i]);
                count++;
            }
        }
        System.out.println("Total count of the three digit number in the array are: "+count);
    }
}
