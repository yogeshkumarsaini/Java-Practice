package Array;

import java.util.Scanner;

public class MaximumFrequency {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter the element of the Array");
        int[] a = new int[n];
        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        checkFrequencyMax(a);
        sc.close();
    }
    public static void checkFrequencyMax(int[] a){
        int n= a.length-1;
        int max_count=0;
        int target=0;
        for(int i=0;i<=n;i++){
            int count=1;
            for(int j=i+1;j<=n;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    n--;
                    j--;
                }
            }
            if(max_count<count){
                target=a[i];
                max_count=count;
            }
            
        }
        System.out.println("Maximum appeared element in array "+target+" are: "+max_count);
        
    }
}
