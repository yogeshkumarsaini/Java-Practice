/*
 * Draw the Pattern are:
 *      1 2 3 4 5
 *      1 2 3 4 5
 *      1 2 3 4 5
 *      1 2 3 4 5
 *      1 2 3 4 5
 */

package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
