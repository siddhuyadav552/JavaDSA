public class ArraySortedorNot {

    public static void CheckSortedorNot(int arr[], int x, int y) {

        if (arr[x] < arr[y]) {
            if (y == (arr.length - 1)) {
                System.out.println("Sorted Array");
                return;
            }
            x++;
            y++;
            CheckSortedorNot(arr, x, y);

        } else {
            System.out.println("Unsorted Array");
        }

    }

    public static void main(String args[]) {

        int x = 0;
        int y = 1;
        int arr[] = { 12, 14, 18, 19, 22, 27, 29, 35, 69, 78, 89, 98, 110, 112 };
        CheckSortedorNot(arr, x, y);

    }
}
