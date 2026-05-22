// package BackTracking;

public class tempCodeRunnerFile {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 8, 7, 1, 3, 6, 5, 49, 8, 75, 20, 1, 3 };
        arr[1] = 5;
        System.out.println(arr[1]);
        printArr(arr);

    }
}