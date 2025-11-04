package Array;
// the most frequent element in doubles type of array

public class Array20 {
   public static void main(String[] args) {
    double[] arr = {1.1,2.2,3.3,1.1,1.2,2.2,1.1};
    boolean arr1[] = new boolean[arr.length];
    for(int i=0;i<arr.length;i++){
        int count=1;
        if(arr1[i]==false){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[j]){
                    count++;
                }
            }
           
        }
        
    }
   }
}

// public static double findMostFrequentElement(double[] array) {
//     // Create a new array to store the frequencies of each element in the original array.
//     int[] frequencies = new int[array.length];

//     // Iterate through the original array, and for each element, increment the frequency of that element in the new array.
//     for (int i = 0; i < array.length; i++) {
//         frequencies[array[i]]++;
//     }

//     // Find the element in the new array with the highest frequency.
//     int mostFrequentIndex = 0;
//     int mostFrequentFrequency = frequencies[0];
//     for (int i = 1; i < frequencies.length; i++) {
//         if (frequencies[i] > mostFrequentFrequency) {
//             mostFrequentIndex = i;
//             mostFrequentFrequency = frequencies[i];
//         }
//     }

//     // Return the element at the index of the most frequent element in the new array.
//     return array[mostFrequentIndex];
// }