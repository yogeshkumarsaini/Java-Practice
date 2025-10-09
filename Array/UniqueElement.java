package Array;
import java.util.Scanner;
public class UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter the element of array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        if(getUnique(a))
            System.out.println("All the element in the array are unique");
        else
            System.out.println("In the array element are not unique");
        sc.close();
    }
    public static boolean getUnique(int[] a){
        int n = a.length-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n;j++){
                if(a[i]==a[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
