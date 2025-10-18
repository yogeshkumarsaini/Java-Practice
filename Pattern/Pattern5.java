/*
 * Draw the Pattern are: 
 *      5 4 3 2 1
 *      5 4 3 2 1
 *      5 4 3 2 1
 *      5 4 3 2 1
 *      5 4 3 2 1
 */
package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
