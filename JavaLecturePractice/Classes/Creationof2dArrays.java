import java.util.Scanner;

public class Creationof2dArrays {
    public static void main(String args[]) {

        // 3x3 matrix introduced

        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int col = 3;

        // Storing the values in matrix

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value of " + (i + 1) + " " + (j + 1) + " :");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the values of the matrix

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
