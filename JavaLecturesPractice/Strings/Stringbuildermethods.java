import java.util.*;

public class Stringbuildermethods {
    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);

        // Stringbuilder Java ki ek class hai jo mutable String banati hai, Means same
        // object change ho jata hai new nhi banta
        StringBuilder sb = new StringBuilder("Siddhartha");
        System.out.println(sb.capacity());
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder(sb);

        // append() string ke last me add krta hai
        System.out.println(sb.append(" is the student of Chandigarh University & pursing MCA."));

        // insert(index ,str) string me kisi particular position pr string add krta hai
        System.out.println(sb.insert(5, "0000"));

        // delete(start, end)
        // System.out.println(sb.delete(0, sb.length()) + "Deleted");

        // reverse string ko ulta krdeta hai
        System.out.println(sb.reverse()); // ulti ho gyi
        // System.out.println(sb.reverse()); // ab seedhi
        System.out.println(sb1.toString());

    }
}