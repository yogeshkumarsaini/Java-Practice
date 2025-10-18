/*
 * Draw the Pattern are:
 *      5 5 5 5 5
 *      4 4 4 4 4
 *      3 3 3 3 3
 *      2 2 2 2 2
 *      1 1 1 1 1
 */
package Pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(n-i+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
