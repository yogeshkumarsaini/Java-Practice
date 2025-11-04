package Array;
//WAJP to find out the largest element in short type of array
public class Array13 {
     public static void main(String[] args) {
        short[] arr = {8,4,3,1,5};
        double largest=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] > largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest element in short type of array: "+largest);
    }
}
