// import java.util.Scanner;
public class ArraysasFucntionArguments {

    public static void BonusMarks(int marks[], int a) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 5; // or we can write it as marks[i]+=5 ;
            System.out.println(marks[i]);
        }
    }
    public static void main(String args[]) {
        int marks[] = { 95, 65, 75, 42, 45, 65, 86, 72, 81 }; // int [][] marks, fruits, gems, animals, development ( 5
                                                              // new 2D arrays declare hue hai)
        int a = 5;
        BonusMarks(marks, a);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " "); // Primitive Types (int, char, double):
                                              // Inki "Value" asli data hoti hai (jaise 5, 10). Jab aap inhe pass karte
                                              // hain, toh inki copy banti hai. Isliye original change nahi
                                              // hota.

            // Reference Types (Arrays, Objects): Inki "Value" asli data nahi,
            // balki memory ka Address (Reference) hoti hai.
        }

    }

}
