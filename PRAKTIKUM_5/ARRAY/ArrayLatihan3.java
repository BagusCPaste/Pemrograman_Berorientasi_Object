package PRAKTIKUM_5.ARRAY;

// SHORTING
public class ArrayLatihan3 {
       static void bubbleSort(int arr[]){
              int n = arr.length;
              for (int i = 0; i < n - 1; i++) {
                     for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                   int temp = arr[j];
                                   arr[j] = arr[j + 1];
                                   arr[j + 1] = temp;
                                   printArray(arr);
                            }
                     }
              }
              System.out.println();      
       }
       static void swap(int[] arr, int i, int j){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
       }

       // QUICK SORT
       static void quickSort(int[] arr, int low, int high){
              if (low < high) {
                     // pivot
                     int pivot = arr[high];
                     int i = (low - 1);
                     for(int j = low; j <= high - 1; j++) {
                            if (arr[j] < pivot) {
                            i++;
                            swap(arr, i, j);
                            printArray(arr);
                            }
                     }
                     swap(arr, i + 1, high);
                     // Separately sort elements before partition and after partition
                     quickSort(arr, low, i - 1);
                     quickSort(arr, i + 1, high);
              }
       }
       // INSERTION SORT
       public static void insertionSort(int arr[]){
              int n = arr.length; 
              for (int i = 1; i < n; ++i) {
                     int key = arr[i];
                     int j = i - 1;
                     /* Move elements of arr[0..i-1], that are
                     greater than key, to one position ahead
                     of their current position */
                     while (j >= 0 && arr[j] > key) {
                            arr[j + 1] = arr[j];
                            j = j - 1;
                     }
                     arr[j + 1] = key;
                     printArray(arr);
              }
       }
       // SELECTION SORT
       public static void selectionSort(int arr[]){
              int n = arr.length;
              // One by one move boundary of unsorted subarray
              for (int i = 0; i < n-1; i++){
                     // Find the minimum element in unsorted array
                     int min_idx = i;
                     for (int j = i+1; j < n; j++){
                            if (arr[j] < arr[min_idx]){
                                   min_idx = j;
                                   // Swap the found minimum element with the first
                                   // element
                                   int temp = arr[min_idx];
                                   arr[min_idx] = arr[i];
                                   arr[i] = temp;
                                   printArray(arr);
                            }
                     }
              }
       }
       
       public static void merge(int arr[], int l, int m, int r){
              // Find sizes of two subarrays to be merged
              int n1 = m - l + 1;
              int n2 = r - m;
              /* Create temp arrays */
              int L[] = new int[n1];
              int R[] = new int[n2];
              /*Copy data to temp arrays*/
              for (int i = 0; i < n1; ++i){
                     L[i] = arr[l + i];
                     for (int j = 0; j < n2; ++j){
                            R[j] = arr[m + 1 + j];
                            /* Merge the temp arrays */
                            // Initial indexes of first and second subarrays
                           // int i = 0, j = 0;
                            // Initial index of merged subarray array
                            int k = l;
                            while (i < n1 && j < n2) { 
                                   if (L[i] <= R[j]) {
                                          arr[k] = L[i];
                                          i++;
                                   }
                                   else {
                                          arr[k] = R[j];
                                          j++; 
                                   }
                                   k++;
                            }
                            /* Copy remaining elements of L[] if any */
                            while (i < n1) {
                                   arr[k] = L[i];
                                   i++;
                                   k++;
                                   printArray(arr); 
                            } 
                            /* Copy remaining elements of R[] if any */
                            while (j < n2) {
                                   arr[k] = R[j];
                                   j++;
                                   k++;
                                   printArray(arr);
                            }
                     }
              } 
       }
       // MERGE SORT
       public static void mergeSort(int arr[], int l, int r){
              if (l < r) {
                     // Find the middle point
                     int m = l + (r - l) / 2;
                     // mergeSort first and second halves
                     mergeSort(arr, l, m);
                     mergeSort(arr, m + 1, r);
                     // Merge the sorted halves
                     merge(arr, l, m, r);
              }
       }
       static void printArray(int arr[]){
              int n = arr.length;
              for (int i = 0; i < n; ++i) {
                     System.out.print(arr[i] + " ");
              }
              System.out.println();
       }
}
