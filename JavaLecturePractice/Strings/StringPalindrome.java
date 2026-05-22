package Strings;
import java.util.Scanner;

public class StringPalindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String Target = sc.nextLine();
        String Reversed = "";
        int j = Target.length();
        for (int i = Target.length() - 1; i >= 0; i--) {

            Reversed = Reversed + Target.charAt(j - 1);
            j--;
        }

        if (Reversed.equalsIgnoreCase(Target)) {
            System.out.print("Yes, it's a palindrome.");
        } else {
            System.out.print("Not a Palindrome.");
        }
        sc.close();

    }
}
