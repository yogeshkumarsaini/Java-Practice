/*
 * Draw the Pattern Are:
 *               1
 *             1 2
 *           1 2 3
 *         1 2 3 4
 *       1 2 3 4 5
 */
package Pattern;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
