package Number;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        getRow(a);
        sc.close();
    }
    public static void getRow(int n){
        for(int i=0;i<n;i++){
            int comb=1;
            for(int j=0;j<=i;j++){
                comb=(comb*(n-1-j))/(j+1);
            }
            System.out.println(comb+" ");
        }
    }
}
