public class MergeSort1 {

    public static void mergeSort(int arr[], int si, int ei) {
        // 1. Base Case: If the segment has 1 or 0 elements, it's already sorted
        if (si >= ei) {
            return;
        }

        // 2. Find the midpoint
        int mid = si + (ei - si) / 2;

        // 3. Recursively sort the left and right halves
        mergeSort(arr, si, mid); // Left part fixed (ei -> mid)
        mergeSort(arr, mid + 1, ei); // Right part

        // 4. Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // Iterator for left side
        int j = mid + 1; // Iterator for right side
        int k = 0; // Iterator for temp array

        // Compare and copy smaller elements into temp
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else { // Fixed brack ets syntax error here
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left side (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right side (if any)
        while (j <= ei) { // Fixed condition (i -> j)
            temp[k++] = arr[j++];
        }

        // Copy temporary array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 9, 5, 7, 4, 2, 1, 9, 8, 6, 5, 4, 3, 5, 1, 5, 3, 2, 1, 5 };

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}