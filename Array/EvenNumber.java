package Array;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter the elements of array are: ");
        int[] a = new int[n];
        for(int i=0; i<a.length;i++){
            System.out.println("Element in the array index is: "+(i+1));
            a[i]=sc.nextInt();
        }
        getEven(a);
        sc.close(); 
    }
    public static void getEven(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("It is Even number at index: "+(i+1)+" and elment are: "+a[i]);
                count++;
            }
        }
        System.out.println("Total count of the even number in the Array are: "+count);
    }
}
