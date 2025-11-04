import java.util.Scanner;

public class elemnetInsertPosition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0; i<x; i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println("Enter the element");
        int value=sc.nextInt();
        System.out.println("which index element is stored");
        int index=sc.nextInt();
        insert(arr, value, index);

    }
    public static int[] insert(int[] a, int value, int index){
        int[] b = new int[arr.length+1];
        b[index]=value;
        for(int i=0;i<b.length;i++){
            if(i<index){
                b[i]=a[i];

            }
            else{
                b[i+1]=a[i];
            }
            return b;
        }
    }
}
