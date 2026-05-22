
import java.util.Scanner;
public class HalfPyramid{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // First loop 4 times chalega
        System.out.println("Enter the lines of which size you want to print: ");
        int a = sc.nextInt();

        for (int i=1; i<=a; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}