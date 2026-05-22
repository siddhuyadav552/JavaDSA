
import java.util.Scanner;

public class InvertedHalfPyramid {
    Scanner sc = new Scanner(System.in);

    public static void pyramid() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {

            for (int j = (size - i); j > 0; j--) {
                System.out.print(" ");

            }

            //                            *
            //                           **
            //                          ***
            //                         ****
            //                        *****
            //                       ******

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

        sc.close();
    }

    public static void main(String args[]) {
        System.out.println("Enter the rows of pyramid: ");
        pyramid();
    }
}
