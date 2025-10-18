/*
 * Draw the Pattern are:
 *      0
 *      1 0
 *      0 1 0
 *      1 0 1 0
 *      0 1 0 1 0
 *      1 0 1 0 1 0
 */

package Pattern;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
