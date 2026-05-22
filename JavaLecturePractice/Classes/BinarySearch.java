import java.util.*;

public class BinarySearch {

    public static int search(int numbers[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value you want to search: ");
        int target = sc.nextInt();
        sc.close(); 

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (numbers[mid] == target) {
                return mid;
            } 
            else if (numbers[mid] < target) {
                low = mid + 1;
            } 
            else { 
                high = mid - 1;
            }
        }
        return -1;
        
    }

    public static void main(String args[]) {
        int numbers[] = { 25, 45, 85, 65, 45, 75, 95, 15, 25, 21, 355, 45454, 787, 85, 62, 43, 41, 35, 38, 39, 37, -15, -25, -7 };
        
        Arrays.sort(numbers);
        
        int result = search(numbers);

        
        if (result != -1) {
            System.out.print("Found at index number: " + result);
        } else {
            System.out.print("Not found");
        }
        
    }
  

}