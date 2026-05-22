public class Lastoccurence {

    public static void ChcekLastOccurence(int arr[], int target, int index) {

        // Base Case
        if (index <= 0) {
            System.out.println("Not Found");
            return;

        }

        if (target == arr[index-1]) {
            System.out.println("Found at index : " +  ((arr.length + 1)-index) + " from last");
            return;
        }

        ChcekLastOccurence(arr, target, index-1);

    }

    public static void main(String args[]) {
        int target = 9;
        int arr[] = { 1, 2, 3, 5, 1, 4, 9, 4, 1, 5, 8, 6, 5, 2, 4 };
        int index = arr.length;

        ChcekLastOccurence(arr, target, index);

    }
}
