
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 6, 3, 4, 8, 7, 9, 5, 4, 6, 5, 8};
        System.out.println("Original Array:");
        printArray(arr);
        
        // Pivot index 7 par value 7 hai, usse last index se swap karenge
        int pivot = 7;
        swap(arr, 7, arr.length - 1); 
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        System.out.println("\nPivoting with: " + pivot);
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
                System.out.println("Swap: A[" + i + "] and A[" + j + "] | Array: ");
                printArray(arr);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
}