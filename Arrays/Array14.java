package Array;
// WAJP to find out the smallest character in char type of array
public class Array14 {
    public static void main(String[] args) {
        char[] arr = {'Z','G','E','S','I'};
        char smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest character in char type of array: "+smallest);
    }
}
