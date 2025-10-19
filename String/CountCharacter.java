package String;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        getCount(s);
        sc.close();
    }
    public static void getCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(p>=65 && p<=87 || p>=97 && p<=122 || p==' '){
                count++;
            }
        }
        System.out.println("Total count of Charcater in the String are: "+count);
    }
}
