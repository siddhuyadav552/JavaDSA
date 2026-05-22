public class InsertionSort {

    public static void SortInsertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            // i = 1 eslye lia h kyuki, hamne array ka phela element jo ki 0 index
            // pr ha usko already sorted maan lia hai
            int j = i - 1;
            for (; j >= 0; j--) {

                if (arr[j] > temp) {
                    // shift only
                    arr[j + 1] = arr[j];

                } else {
                    break;
                }

                

            }
            arr[j+1] = temp;

        }

    }
    public static void main(String args[]) {
        int arr[] = { 5, 9, 7, 3, 4, 6, 1, 2, 8 };
        SortInsertion(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }

}
