public class StringManipulation {
    public static void main(String args[]) {
        String b = "hello java world";
        String a = "Hello Java World";

        // System.out.println(" " + );

        System.out.println();
        System.out.println(".trim()method ----> " + a.trim()); // Remove extra space
        System.out.println();
        System.out.println(".toUpperCase()method ----> " + a.toUpperCase());// All letters upper case
        System.out.println();
        System.out.println("substring method ----> " + a.substring(2, 8)); // Print beech me se kuch numbers
        System.out.println();
        System.out.println("replace method() ----> " + a.replace('a', 'b')); //
        System.out.println();
        System.out.println("compareTo() method ----> " + a.compareTo(b)); // Do strings ko lexicographically (dictionary
                                                                          // order) compare karta hai
                                                                          //Phele different character ka difference return karta hai  
        System.out.println();
        System.out.println("length function ---->" + a.length());  //String ki length dega 
        System.out.println();





        

        //  N O W     S T R I N G B U I L D E R     M E T H O D S




        StringBuilder sb = new StringBuilder(a);
        StringBuilder sb1 = new StringBuilder(a);
        System.out.println("StringBuilderPrint ----> " + sb);
        System.out.println();
        System.out.println(sb.append("!!!!"));
        System.out.println();
        // System.out.println(sb.insert(5, "Hello"));
        System.out.println(".delete(kahan se, kahan tak), delete words from a range ---->" + sb.delete(2, 6));
        System.out.println();
        System.out.println(".deleteCharAt(index value)" + sb.deleteCharAt(5));
        System.out.println();

        System.out.println(sb1);
        System.out.println();
        System.out.println(sb1.replace(2, 9, "REPLACED STRING"));
        System.out.println();
        sb1.setCharAt(2, 'h');
        System.out.println(sb1);

    }
}
