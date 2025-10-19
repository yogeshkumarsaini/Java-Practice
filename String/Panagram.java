package String;
// WAJP to find weather a String is PANAGRAM or not?
import java.util.Scanner;

/* Panagram are: 
 *  All the charcater of alphabet is used in at least once of the string
 */
public class Panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        if(getPanagram(s))
            System.out.println("It is a Panagram");
        else
            System.out.println("It is not a Panagram");
        sc.close();
    }
    public static int[] getCount(String s){
        int[] a=new int[26];
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(p>=65 && p<=95)
                a[p-65]++;
            else if(p>=97 && p<=122)
                a[p-97]++;
        }
        return a;
    }
    public static boolean getPanagram(String s){
        int[] count=getCount(s);
        for(int i=0;i<count.length;i++){
            if(count[i]==0)
                return false;
        }
        return true;
    }
}
