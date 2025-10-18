/*
 * Draw the Pattern Are:
 *      1
 *      6 2
 *      10 7 3
 *      13 11 8 4
 *      15 14 12 9 5 
 */

package Pattern;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1){
                    System.out.print(j+" ");
                }
                else if(i==2){
                    if(j==1){
                        System.out.print(6+" ");
                    }
                    else{
                        System.out.print(j+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
