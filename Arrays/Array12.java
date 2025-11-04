package Array;
//WAJP to find out the smallest element in double type of array
public class Array12 {
    public static void main(String[] args) {
        double[] arr = {6.1,2.2,1.3,4.4,5.5};
        double smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element in double type of array: "+smallest);
    }
    

}
