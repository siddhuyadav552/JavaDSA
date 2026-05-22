
import java.util.Scanner;
public class passfail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int a = sc.nextInt();
        if (a<33){
            System.out.println("Failed");
        }
        else if(a>=33){
            System.out.println("Passed");
        }
        sc.close();
    }
}
