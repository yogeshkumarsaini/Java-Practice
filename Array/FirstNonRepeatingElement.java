package Array;

import java.util.Scanner;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a =new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int index=checkFirstNonRepeating(a);
        if(index>=0)
            System.out.println("Element is at index: "+index+" and its value is: "+a[index]);
        else
            System.out.println("Non-Repeated element is not found");
        sc.close();
    }
    public static int checkFirstNonRepeating(int[] a){
        int n= a.length;
        for(int i=0; i<n;i++){
            int j;
            for(j=0;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    break;
                }
            }
            if(j==n)
                return i;
        }
        return -1;
    }
}
