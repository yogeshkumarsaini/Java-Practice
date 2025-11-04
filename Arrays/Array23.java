package Array;
// Print unique element in given array
public class Array23 {
    public static void main(String[] args) {
        int[] arr ={1,1,2,4,3,6,4,7,3,4,5,7,2,3,3,5,8};
        boolean[] arr1 = new boolean[arr.length];
        for(int i=0; i<arr.length;i++){
            int count=1;
            if(arr1[i]==false){
                for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr1[j]=true;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
            
        }
            
        }
    }
}
