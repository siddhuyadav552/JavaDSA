import java.util.Scanner;

public class LargestInArray {

    public static void largest(int numbers[]) {
        int tempvalue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > tempvalue ){
                tempvalue = numbers[i];
            }
        }
        System.out.print("Largest Value is: " + tempvalue);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 25, 45, 85, 65, 45, 75, 95, 15, 25, 35, 65, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 355,
                45454, 787, 85, 62, 43, 41, 35, 38, 39, 37,  -15, -25, -7 };
        largest(numbers);

        sc.close();
    }
}



