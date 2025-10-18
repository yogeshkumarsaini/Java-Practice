/*
 * Draw the Pattern are:
 *              A
 *            A   B
 *          A   B   C
 *       A    B   C    D
 *     A    B    C   D    E
 */
package Pattern;

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print((char)(64+k)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
