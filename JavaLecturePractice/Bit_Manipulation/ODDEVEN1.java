
import java.util.*;
public class ODDEVEN1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();
        if((num & 1) == 1){
            System.out.print("Odd number");
        }
        else{
            System.out.print("Even number");
        }
        sc.close();

    }
    
}
