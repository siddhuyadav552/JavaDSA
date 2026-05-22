
import java.util.Scanner;

public class FloydTriangle {

    public static void triangle() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int nums = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(nums + " ");
                nums++;
                
            }
            System.out.println();

        }
        sc.close();
        
    }


    public static void main(String args[]) {
        System.out.println("Enter the rows no of triangle you want to print: ");
        triangle();
    }

}

