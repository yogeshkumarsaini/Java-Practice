/*
 * Draw the Pattern are:
 *              A
 *            B   B
 *          C   C   C
 *       D    D   D    D
 *     E    E    E   E    E
 */
package Pattern;

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j= n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" "+(char)(64+i)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
