
import java.util.Scanner;
public class PrintNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Counting till: ");
        int counter= sc.nextInt();
        int a = 1;
        while (a <= counter) {
            System.out.println(a);
            a++ ;
        }
        sc.close();

    
    }   
}