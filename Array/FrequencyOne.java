package Array;
import java.util.Scanner;
public class FrequencyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter the element of the Array");
        int[] a = new int[n];
        for(int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        checkFrequencyOne(a);
        sc.close();
    }
    public static void checkFrequencyOne(int[] a){
        int n= a.length-1;
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
            if(count==1){
                System.out.println("Frequncy One element in array : "+a[i]+" is: "+count+ " times");
            }
            else{
                System.out.println("There is no element in the array who's frequency is one");
            }
        }
    }
}
