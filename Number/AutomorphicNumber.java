package Number;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(checkAutomorphic(a)){
            System.out.println("It is a Automoprphic Number");
        }
        else{
            System.out.println("It is not a Automorphic Number");
        }
        sc.close();
    }
    public static boolean checkAutomorphic(int n){
        int sqr =n*n;
        while(n>0){
            if(n%10!=sqr%10){
                return false;
            }
            n=n/10;
            sqr=sqr/10;
        }
        return true;
    }
}

