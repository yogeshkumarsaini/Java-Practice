package Number;
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of seats");
        int a = sc.nextInt();
        System.out.println("Enter the total number of boys");
        int b = sc.nextInt();
        checkPermutation(a,b);
        sc.close();
    }
    public static void checkPermutation(int a, int b){
        int arr=1;
        for(int i=0; i<b;i++){
            arr=arr*(a-i);
        }
        System.out.println("Total number of ways are: "+arr);
    }
}
