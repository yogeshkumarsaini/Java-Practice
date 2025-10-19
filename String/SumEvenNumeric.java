package String;
// WAJP to take a String input and print sum of all the even numeric characters in the String
import java.util.Scanner;
public class SumEvenNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        getEvenSum(s);
        sc.close();
    }
    public static void getEvenSum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            char p =s.charAt(i);
            if(p>=48 && p<=57){
                if(p%2==0){
                    sum=sum+p-48;
                }
            }
        }
        System.out.println("Sum of even numeric character are: "+sum);
    }
}
