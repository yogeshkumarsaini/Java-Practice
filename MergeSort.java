public class MergeSort {
    public static void main(String[] args) {
        int[] a1 = {5, 2, 8, 1, 9};
        int[] a2 = {4, 7, 6, 3, 90};
        int[] arr = mergeArrays(a1, a2);
        
        mergesort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergesort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergesort(arr, lb, mid);
            mergesort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    public static void merge(int[] arr, int lb, int mid, int ub) {
        int[] b = new int[arr.length];
        int i = lb;
        int j = mid + 1;
        int k = lb;
        
        while (i <= mid && j <= ub) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        
        while (j <= ub) {
            b[k] = arr[j];
            j++;
            k++;
        }
        
        for (k = lb; k <= ub; k++) {
            arr[k] = b[k];
        }
    }

    // Merges two arrays into one
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            arr[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            arr[a1.length + i] = a2[i];
        }
        return arr;
    }
}
