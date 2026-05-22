
import java.util.Scanner;
public class FactorialFunc {
    public static int Factorial(int a){
            int store= 1;
            for (int i= 1; i<=a; i++){
                store= i*store;
            }
            return store;

        }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int result= Factorial(32);
        System.out.print(result);
        sc.close();

    }
    
}