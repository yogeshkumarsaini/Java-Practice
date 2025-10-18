package Pattern;

import java.util.Scanner;

/**
 * Draw the Pattern are:
 *      A B C D E
 *      F G H I J
 *      K L M N O
 *      P Q R S T
 *      U V W X Y
 */
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        char a='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}