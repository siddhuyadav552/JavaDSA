import java.util.Scanner;

public class HollowRhombus {
    public static void Rhombus() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Hollow Rhomobus me phele space then stars

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= c; k++) {
                if (i == 1 || i == r || k == 1 || k == c) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        sc.close();
    }

    public static void main(String args[]) {
        System.out.print("Enter rows and columns of Hollow Rhombus: ");

        Rhombus();
    } 

}
