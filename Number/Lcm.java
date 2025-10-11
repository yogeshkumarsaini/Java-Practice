package Number;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 number");
        int a = sc.nextInt();
        System.out.println("Enter the 2 number");
        int b = sc.nextInt();
        System.out.println("Enter the 3 number");
        int c = sc.nextInt();
        getLcm(a,b,c);
        sc.close();
    }
    public static void getLcm(int a, int b, int c){
        for(int i=1 ; ;i++){
            if(i%a==0 && i%b==0 && i%c==0){
                System.out.println(i);
                break;
            }
        }
    }
}
