package String;
// WAJP take a String input and print and count all the words which has even number of charcters.

import java.util.Scanner;

public class EvenWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        getEvenWord(s);
        sc.close();
    }
    public static void getEvenWord(String s){
        String[] k=s.split(" ");
        int count=0;
        for(int i=0;i<k.length;i++){
            String p=k[i];
            if(!p.isEmpty()){
                if(p.length()%2==0){
                    System.out.println(p);
                    count++;
                }
            } 
        }
        System.out.println("Total such word are: "+count);
    }
}
