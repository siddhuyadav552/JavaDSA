public class StringManipulation {
    public static void main(String args[]) {
        String a = " Hello Java World";
        String b = " hello java world";

        //       System.out.println(" " + );


        System.out.println(".trim()method ---> " + a.trim());
        System.out.println(".toUpperCase()method ---> " + a.toUpperCase());
        System.out.println("substring method ---> " + a.substring(2, 8));
        System.out.println("replace method() ---> " + a.replace('a', 'b'));
        System.out.println(" compareTo() method ----> " + a.compareTo(b));


        // N O W   S T R I N G B U I L D E R   M E T H O D S

        StringBuilder sb = new StringBuilder(a);
        System.out.println(" StringBuilderPrint ----> " + sb);
        System.out.println(sb.append("!!!!"));
        System.out.println(sb.insert(5, 'z'));








    }
}
