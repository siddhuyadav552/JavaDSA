public class Subarrays {

    public static void main(String args[]) {
        // int numbers[] = {5,8,4,6,3,9,7,1,2,10,15,13,12,14,19};

        int numbers[] = { 5, 8, 4, 6, 3, 9, 7, 1 };

        int a = numbers.length;

        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.println();
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }

            }
            System.out.println();
        }

    }

}
