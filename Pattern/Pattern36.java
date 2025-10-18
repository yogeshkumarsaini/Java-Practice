/*
 * Draw the Pattern Are: 
 *        * * * * * * *
 *          * * * * *
 *            * * *
 *              *
 *            * * *
 *          * * * * *
 *        * * * * * * *
 */

package Pattern;

import java.util.Scanner;

public class Pattern36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*(n-i)+1;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*(n-i)+1;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}
