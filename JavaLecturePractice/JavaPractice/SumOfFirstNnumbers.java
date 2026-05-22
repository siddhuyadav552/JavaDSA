
import java.util.Scanner;
public class SumOfFirstNnumbers{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.print("Sum of first N natural Numbers: ");
        int N = input.nextInt();
        int a=1;
        int sum= 0;
        while (a<=N){
            sum= sum + a;
            a++;
        }
        System.out.println(sum);
        input.close();
    }
}