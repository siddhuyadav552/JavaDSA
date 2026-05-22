public class FirstOccurence {
    public static void CheckOccurence(int arr[], int target, int i) {
        // Base Case
        if (i == arr.length) {
            System.out.println("Not found");
            return;
        }

        if (arr[i] == target) {
            System.out.println("First occurence at : " + (i + 1));
            return;
        }

        i++;
        CheckOccurence(arr, target, i);

    }

    public static void main(String args[]) {
        int target = 46; // The number to be checked
        int i = 0; // Start Checking value from index
        int arr[] = { 1, 2, 3, 4, 8, 6, 7, 8, 1, 4, 5, 8, 6, 4, 7, 8, 6, 2, 1, 45, 46 };
        CheckOccurence(arr, target, i);

    }

}
