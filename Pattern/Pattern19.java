/*
 * Draw the Pattern Are:
 *               1
 *             2 2
 *           3 3 3
 *         4 4 4 4
 *       5 5 5 5 5
 */

package Pattern;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
            System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
