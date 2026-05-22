
import java.util.Scanner;
public class StarPattern {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        
        System.out.print("How many lines star triangle do you want ? ");
        int lines = input.nextInt();
        int a,b;                         
        for(a = 1; a<= lines; a++){
            System.out.println();
            for( b= 1; b<=a; b++){
                System.out.print("*");
            }
        }
        input.close();
    }
}
