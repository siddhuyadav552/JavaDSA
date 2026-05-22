
import java.util.Scanner;
public class CharPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines Count: ");
        int lines = sc.nextInt();
        char s = 'A';

        for(int i=1; i<=lines; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print(s);
                s++;
            }
            System.out.println();
        }
        sc.close();
    }
}
