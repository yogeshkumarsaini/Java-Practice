package Array;

import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
       
        moveZeroInEnd(a);
        System.out.println("Resultant Array: ");
		for(int x:a)
			System.out.print(x+"  ");
        sc.close();
    }
    public static int[] moveZeroInEnd(int[] a){
        int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0)
				a[count++]=a[i];
		}
		while(count<a.length) 
			a[count++]=0;
	return a;
    }
}
