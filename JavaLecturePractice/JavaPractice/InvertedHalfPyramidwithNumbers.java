
import java.util.Scanner;
public class InvertedHalfPyramidwithNumbers {

    public static void pyramid(){
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        int count = rows;
        for (int i= 1; i<= rows; i++ ){
            for(int j=1; j<= count; j++ ){
                System.out.print(j);
        
            }
            count--;
        System.out.println();
        }

        sc.close();

    }

    public static void main(String args[]){
       System.out.println("Enter Rows: ");
       pyramid();
        

    }
    
}
