
import java.util.Scanner;
public class PrimeChecker {

    public static void PmCheck(long a){
        if (a<=1){
            System.out.println("Enter Valid value");
        }
        boolean isprime = true;
        for(long i= 2; i<= Math.sqrt(a); i++){
            if (a%i==0){
                isprime = false;
                System.out.println("Non Prime");
                break;
            }
        }
        if (isprime){
            System.out.print("Prime Number");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number to check prime or not: ");
        long a = sc.nextLong();
        PmCheck(a);
        sc.close();
    }
}
