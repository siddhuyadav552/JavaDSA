// import java.util.Scanner;
public class ArraysasFucntionArguments {


    public static void BonusMarks(int marks[] , int a){
        a = 10;
        for(int i=0; i < marks.length; i++){
            marks[i] = marks[i] + 5;

        }
        System.out.println(a);
    }

    public static void main(String args[]){
        int marks[] = {95,65,75,42,45,65,86,72,81};
        int a = 5;
        BonusMarks(marks, a);
        System.out.println(a);

    }
    
}
