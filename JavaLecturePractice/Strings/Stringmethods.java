
public class Stringmethods {
    public static void main(String args[]) {
        String a = "This is string 1.      ";
        String b = "    this is string 2.   ";
        String c = "java";
        String d = "JAVA";

        // length() function
        System.out.println(a.length()); // print the total character count in the string including special kewords.

        // .charAt(index) ye btata hi ki string ke particular index pr konsa character
        // hai
        System.out.println(b.charAt(5)); // 0 se shuru kia, 5 number pr h mila

        // substring() ye string ka part nikalta hai(intial value, end value ) ye dono
        // pass krni pdti hai
        System.out.println(a.substring(2, 9));

        // equals() ye compare karta hai ki content same hai ya nahi
        System.out.println(a.equals(b)); // Boolean value return karta hai, Es case me False krega kyuki a and b ka
                                         // content same nahi hai

        // equalsIgnoreCase() case ignore kakre compare karta hai
        System.out.println(c.equalsIgnoreCase(d)); // Boolean return krega, Es case me TRUE

        // compareTo() Lexicographical Comparison
        System.out.println(a.compareTo(b));

        // Step 1: First character compare
        // a[0] = 'T'
        // b[0] = ' ' (space)
        // Step 2: ASCII values
        // 'T' = 84
        // ' ' = 32
        // Step 3: compareTo calculation
        // 84 - 32 = 52
        // Final Output:
        // 52

        // concat() Join 2 strings
        System.out.println("1. " + a + b);
        System.out.println("2. " + a.concat(b));

        // `+` operator slightly faster hai kyunki compiler ise `StringBuilder` me
        // convert kar deta hai, 
        // jabki `concat()` direct method call karta hai, lekin
        // real-world me dono almost same fast hote hain.
        //+ operator ka compile-time optimization hota hai, isliye + ka compile time processing concat() se kam hota hai.

        //toLowerCase() / toUpperCase()
        System.out.println(b.toUpperCase()); //String ke sare alphabet capital krdega
        System.out.println(a.toLowerCase()); // String ke sare alphabet small krdega

        // trim() Ye extra spaces remove kardeta hai 
        System.out.println("Extra spaces removed new string ------> " + b.trim());

        //replace() ye character ya word replace karta hai 
        System.out.println(a.replace( a.charAt(5) , 'k')); //Original wali change nahi hogi, Strings are immutable.
        System.out.println(a);

    }
}
