package Array;
// Reverse the array elements
public class Array26 {
    public static void main(String[] args)
    {
        int[] arr ={1,2,3,4,5,6,7,8,9,0};
        int temp;
        for(int i=0;i<arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;            
        }
        for(int i=0;i<arr.length;i++)
        {
                System.out.print(arr[i]+" ");
        }
    }
}
