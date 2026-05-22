
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter Second number:");
        int b = sc.nextInt();
        System.out.print("Press + for addition \nPress - for subtraction\nPress / for division\nPress * for multiplication\n");
        String operator= sc.next();
        switch (operator) {
            case "+": System.out.println(a+b);
            break;
            case "-": System.out.println(a-b);
            break;
            case "/": System.out.println(a/b);
            break;
            case "*": System.out.println(a*b);
            break;
            default: System.out.println("try again, Invalid input.");
        }

        sc.close();
    }
}
