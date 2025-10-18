/*
 * Draw the Pattern are: 
 *      1  6 11 16 21
 *      2  7 12 17 22
 *      3  8 13 18 23
 *      4  9 14 19 24
 *      5 10 15 20 25
 */

package Pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int num = (j-1)*n+i;
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
