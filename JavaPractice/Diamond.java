import java.util.Scanner;

public class Diamond {

    public static void diamond() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper Shape
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }

        // Lower Shape

        for (int a = n; a >= 1; a--) {
            for (int j = 1; j <= (n - a); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * a) - 1); k++) {
                System.out.print("*");

            }
            System.out.println();

        }
        sc.close();

    }

    public static void main(String args[]) {
        System.out.print("Enter the size of diamond as rows: ");
        diamond();

    }
}