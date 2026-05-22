
import java.util.Scanner;

public class LinearSearch {

    public static void Search(int numbers[], int n) {
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                System.out.print("Found Value at index number: " + i);
                found = true;
                break;
            }

        }

        if (found != true) {
            System.out.print("Not found");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 15, 14, 25, 65, 84, 95, 75, 42, 12, 11, 15, 36, 0, 1, 88 };
        System.out.print("Enter the value you want to found: ");
        int n = sc.nextInt();

        Search(numbers, n);
        sc.close();

    }

}
