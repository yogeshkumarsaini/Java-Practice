package Array;

import java.util.Arrays;

// Print all the array element in reverse order
public class Array25 {
    public static void main(String[] args) {
        int[]  arr = {1,3,2,5,7,4,9};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
