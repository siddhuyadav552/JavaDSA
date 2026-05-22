package Strings;
import java.util.Scanner;

public class BasicStrings {
    public static void main(String args[]) {

        // String in java are immutable
        // Taking String as input
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter your full name: "));
        // String fname = sc.nextLine();
        String fname = "Siddhartha";
        String lname = "Yadav";

        // String Concatenate

        System.out.println("Name saved: " + fname + " " + lname);
        System.out.println("Now reversing the string. ");

        // For string reverse, we should use String Builder, Currently it's creating
        // copy on every loop.

        String Revname = " ";
        for (int i = (fname.length() - 1); i >= 0; i--) {

            // Char Method

            Revname = Revname + fname.charAt(i);

        }
        System.out.println(Revname + " ");

        // Total Characters in the name
        System.out.println(fname.length() + lname.length());
        sc.close();

    }

}
