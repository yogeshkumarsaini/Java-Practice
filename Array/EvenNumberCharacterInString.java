package Array;

import java.util.Scanner;

public class EvenNumberCharacterInString {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array");
    int n = sc.nextInt();
    System.out.println("Enter the element of the String Array are: ");
    String[] a = new String[n];
    for(int i=0;i<a.length;i++){
        a[i]=sc.next();
    }
    getEvenCharacter(a);
    sc.close();
   }
   public static void getEvenCharacter(String[] a){
    int count=0;
      for(int i=0;i<a.length;i++){
        if(a[i].length()%2==0){
            System.out.println("Even number of character in the string array are: "+a[i]);
            count++;
        }
      }
      System.out.println("Total count of even character in the string array are: "+count);
   } 
}
