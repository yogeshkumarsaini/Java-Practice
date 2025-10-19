package String;
/*WAJP to remove duplicate words from the String
 * Input:mohan is coming and sohan is coming
 * Output:mohan is coming and sohan
 */
import java.util.Scanner;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        removeDuplicate(s);
        sc.close();
    }
    public static void removeDuplicate(String s){
        String[] a=s.split(" ");
        int n=a.length;
        String result="";
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].equalsIgnoreCase(a[j])){
                    a[j]=a[n-1];
                    j--;
                    n--;
                }
            }
        }
        for(int k=0;k<n;k++){
            result=result+a[k]+" ";
        }
        System.out.println(result);
    }
}
