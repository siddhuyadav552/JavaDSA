package Strings;

public class LargestString {
    public static void main(String args[]) {
        String fruits[] = { "Banana", "Apple", "Guvava", "Mango" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) { // .compareto method word ki first word ki ASCII value ko compare
                                                    // karta hai, vha < 0 likha hai [Lexicographical order]
                largest = fruits[i];
            }

        }
        System.out.println(largest);

    }

}
