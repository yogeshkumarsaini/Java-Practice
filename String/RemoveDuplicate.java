package String;
// WAJP to take a String input and remove all the duplicate characters and store in another String.
import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        getRemoveDuplicate(s);
        sc.close();
    }
    public static void getRemoveDuplicate(String s){
        char[] x=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(x[i]==x[j]){
                    x[j]=x[n-1];
                    j--;
                    n--;
                }
            }
        }
        String a="";
        for(int i=0;i<n;i++){
            a=a+x[i];
        }
       System.out.println(a.toString());
    }
}
