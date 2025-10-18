/*
 * Draw the Pattern are: 
 * 
 *      1 2 3 4 5 
 *      2 4 6 8 10
 *      3 6 9 12 15
 *      4 8 12 16 20
 *      5 10 15 20 25
 */

package Pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows and columns: ");
       int n = sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            int num = i+(j-1)*i;
            System.out.print(num+" ");
        }
        System.out.println();
       }
       sc.close();
    }
}
