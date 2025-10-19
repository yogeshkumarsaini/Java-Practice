package String;
/*WAJP to print and count all the duplicate words in the String
 * Input:mohan is coming and sohan is coming
 * Output:  is
            coming    
                
Total Words: 2
 */
import java.util.Scanner;

public class DuplicateWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        checkDuplicate(s);
        sc.close();
    }
    public static void checkDuplicate(String s){
        String[] a=s.split(" ");
        int n=a.length;
        int count=0;
        for(int i=0;i<n;i++){
            String p=a[i];
            for(int j=i+1;j<n;j++){
                if(p.equalsIgnoreCase(a[j])){
                    System.out.println(p);
                    count++;
                }
            }
        }
        System.out.println("Total Words: "+count);
    }
}
