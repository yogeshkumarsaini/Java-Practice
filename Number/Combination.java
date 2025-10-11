package Number;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total players");
        int a = sc.nextInt();
        System.out.println("Enter the number of member in a team");
        int b= sc.nextInt();
        checkCombination(a,b);
        sc.close();
    }
    public static void checkCombination(int a, int b){
        int comb=1;
        for(int i=0;i<a-b;i++){
            comb=(comb*(a-i))/(i+1);
        }
        System.out.println("Total no. of ways for the selections: "+comb);
    }
}
