package Array;
// WAJP for sort the given Array by Bubble Sort
public class Array35 {
    public static void main(String[] args) {
        int[] arr = {9,38,6,4,73,1,2,5};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
