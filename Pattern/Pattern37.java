/*
 * Draw the Pattern Are: 
 *      *             *
 *      * *         * *
 *      * * *     * * *
 *      * * * * * * * *
 *      * * *     * * *
 *      * *         * *
 *      *             *
 */

package Pattern;

import java.util.Scanner;

public class Pattern37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}
