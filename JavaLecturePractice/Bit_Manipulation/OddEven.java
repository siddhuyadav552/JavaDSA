import java.util.*;

public class OddEven {


    //  My version 
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();
        String ToBinary = Integer.toBinaryString(num);
        int Lastdigit = ToBinary.charAt(ToBinary.length() - 1);
        if (Lastdigit == '1') {
            System.out.print("Odd number");

        } else {
            System.out.print("Even number");
        }

    }

}
