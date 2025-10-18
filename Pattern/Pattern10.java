/*
 * Draw the Pattern are:
 *      1 1 1 2 1 3
 *      2 1 2 2 2 3
 *      3 1 3 2 3 3
 */

package Pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" "+j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
