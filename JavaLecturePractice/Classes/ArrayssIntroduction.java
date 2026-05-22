
import java.util.Scanner;
public class ArrayssIntroduction{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks of physics, chemistry, math: ");
        int marks[] = new int[50]; //These are static, not dynamic.
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics Marks: " + marks[0]);
        System.out.println("Chemistry Marks: " + marks[1]);
        System.out.println("Mathematics Marks: " + marks[2]);

        marks[2] = marks[2] + 2;
        System.out.println("Updated mathematics Marks:" + marks[2]);

        int percentage = (((marks[0] + marks[1] + marks[2])/3));
        System.out.println(percentage+ "%");

        System.out.print( "Length of array: " + marks.length);

        // for(int i = 0; i< marks.length; i++){
        //     System.out.print(marks[i] + " ");

        // }
    sc.close();
     }
}