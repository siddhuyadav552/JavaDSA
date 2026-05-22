
import java.util.Scanner;
public class PrintingNumerFromOneToN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want to print numbers: ");
        int a = sc.nextInt();
        int counter = 1;
        while(counter<=a){
            System.out.println(counter);
            counter++;
        
        sc.close();

        }
    }
}
