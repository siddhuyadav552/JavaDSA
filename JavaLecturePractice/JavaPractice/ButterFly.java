import java.util.Scanner;

public class ButterFly {

    public static void butterfly() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // pre stars

            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            // For Middle spaces

            for (int k = 1; k <= (2 * (n - i)); k++) {
                System.out.print("  ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            // For Middle spaces

            for (int k = 1; k <= (2 * (n - i)); k++) {
                System.out.print("  ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        sc.close();
    }

    public static void main(String args[]) {
        System.out.print("Enter the no of rows for the size of your butterfly: ");
        butterfly();
    }

}
