//My Version 


public class DuplicateString {

    public static String remove(String str, StringBuilder sb, int index) {
        if (index == str.length()) {
            return sb.toString();
        }

        char currentChar = str.charAt(index);

        if (sb.indexOf(String.valueOf(currentChar)) == -1) {
            sb.append(currentChar); 
        }

        return remove(str, sb, index + 1);
    }

    public static void main(String[] args) {
        String input = "(*&^%$#SDFGHJKjuytfdgxfcgvhbj,.;'[]";
        System.out.println(remove(input, new StringBuilder(), 0));
    }
}