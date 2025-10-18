package Pattern;

import java.util.Scanner;

class RightTriangle {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=n-1;j>=1;j--){
            for(int i=1;i<=j;i++){

            System.out.print("* "); 
            }
            System.out.println();
        }
        sc.close();
    }
}