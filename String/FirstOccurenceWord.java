package String;
// WAJP to count the occurrence of a word in the String
// Input:mohan is coming and sohan is coming
// Output:The word "is" has appeared 2 times
import java.util.Scanner;

public class FirstOccurenceWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("Enter the word to check the occurrence in the string");
        String k=sc.nextLine();
        checkOccurence(s,k);
        sc.close();
    }
    public static void checkOccurence(String s, String k){
        String[] a=s.split(" ");
        int n=a.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(k.equalsIgnoreCase(a[i])){
                count++;
            }
        }
        System.out.println("The word \""+k+"\" has appeared "+count+" times");
    }
}
