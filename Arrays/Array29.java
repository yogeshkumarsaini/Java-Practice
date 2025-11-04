package Array;

import java.util.Arrays;

// Print all the elements of array through method
public class Array29 {
    public static void main(String[] args) {
        int[] arr = {12,34,5,6,78,90,-2,4};
        sum(arr);

    }
    public static void sum(int[] arr){
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
