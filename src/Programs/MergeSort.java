package Programs;

import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] givenArray = {3,1,2,5,5,6,67,83,2,1,-2,1,-3};
        MergeSort obj = new MergeSort();
        obj.mergeSort(givenArray, 0, givenArray.length-1);

        for (int i :
                givenArray) {
            System.out.println(i);
        }

    }
    public void merge(int[] array, int start, int mid, int end){
        int[] result = new int[end-start+1];
        int forResult =0;
        int pointerFor1stArray =start, pointerFor2ndArray = mid+1;
        while (pointerFor1stArray <mid&& pointerFor2ndArray<end){
            if (array[pointerFor1stArray] <= array[pointerFor2ndArray]){
                result[forResult++] = array[pointerFor1stArray++];
            }
            else {
                result[forResult++] = array[pointerFor2ndArray++];
            }
        }
        while (pointerFor1stArray<mid){
            result[forResult++] = array[pointerFor1stArray++];
        }
        while (pointerFor2ndArray<end){
            result[forResult++] = array[pointerFor2ndArray++];
        }
        for (int i = 0, j=start; i < array.length-1; i++,j++) {
            array[j] = result[i];
        }
    }

    public void mergeSort(int[]array, int start, int end ){
        if(start<= end) return;

        int mid = start + (end-start)/2;

        mergeSort(array, start, mid);
        mergeSort(array, mid+1, end);

        merge(array, start, mid, end);
    }
}
class MergeSortFromGFG{
        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
        void merge(int arr[], int l, int m, int r)
        {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1; int n2 = r - m;
            /* Create temp arrays */
            int L[] = new int[n1];
            int R[] = new int[n2];
            /*Copy data to temp arrays*/
            for (int i = 0; i < n1; ++i) L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j) R[j] = arr[m + 1 + j];
            /* Merge the temp arrays */
            // Initial indexes of first and second subarrays
            int i = 0, j = 0;
            // Initial index of merged subarray array
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {arr[k] = L[i];i++;}
                else {arr[k] = R[j];j++;}
                k++;
            }
            /* Copy remaining elements of L[] if any */
            while (i < n1) {arr[k++] = L[i++];}

            /* Copy remaining elements of R[] if any */
            while (j < n2) {arr[k++] = R[j++];}
        }
        // Main function that sorts arr[l..r] using
        // merge()
        void sort(int arr[], int l, int r)
        {
            if (l < r) {
                int m =l+ (r-l)/2;// Find the middle point
                // Sort first and second halves
                sort(arr, l, m);
                sort(arr, m + 1, r);
                merge(arr, l, m, r);// Merge the sorted halves
            }
        }
        public static void main(String args[])
        {
            int arr[] = { 12, 11, 13, 5, 6, 7 };

            System.out.println("Given Array");
            printArray(arr);

            MergeSortFromGFG obj = new MergeSortFromGFG();
            obj.sort(arr, 0, arr.length - 1);

            System.out.println("\nSorted array");
            printArray(arr);
        }

    static void printArray(int arr[])
    {/* A utility function to print array of size n */
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}




