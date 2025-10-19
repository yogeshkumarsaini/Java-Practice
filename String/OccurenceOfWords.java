package String;
// WAJP to print the occurrence of each words in the string
import java.util.Scanner;

public class OccurenceOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        checkOccurence(s);
        sc.close();
    }
    public static void checkOccurence(String s){
       String[] a= s.split(" ");
       int l=a.length;
       for(int i=0;i<l;i++){
        int count=1;
        String p=a[i];
        for(int j=i+1;j<l;j++){
            if(p.equalsIgnoreCase(a[j])){
                count++;
                a[j]=a[l-1];
                j--;
                l--;
            }
        }
        System.out.println("Word \""+p+"\" is: "+count+" times");
       }
    }
}
