package Number;

import java.util.Scanner;

public class ReplaceDigitsZeroToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        getNum(a);
        sc.close();
    }
    public static void getNum(int n){
        int final_0=0;
        int tenMultiple=1;
        while(n>0){
            int rem=n%10;
            if(rem!=0)
                final_0=final_0+tenMultiple*rem;
            else
            final_0=final_0+tenMultiple*1;
            n=n/10;
            tenMultiple=tenMultiple*10;
        }
        System.out.println(final_0);
    }
}
