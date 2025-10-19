package String;
/*WAJP to print and count all the words which has appeared only once in the string.
 * Input:mohan is coming and sohan is coming
Output: mohan 
        is    
        coming
        and   
        sohan 
        
Total Words: 5
 */
import java.util.Scanner;

public class OnceAppearedWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        checkOnceAppeared(s);
        sc.close();
    }
    public static void checkOnceAppeared(String s){
        String[] a=s.split(" ");
        int n=a.length;
        for(int i=0;i<n;i++){
            String p=a[i];
            for(int j=i+1;j<n;j++){
                if(p.equalsIgnoreCase(a[j])){
                    a[j]=a[n-1];
                    j--;
                    n--;
                }
            }
           
        }
        for(int k=0;k<n;k++){
            System.out.println(a[k]);
        }
        System.out.println("Total Words: "+n);
    }
}
