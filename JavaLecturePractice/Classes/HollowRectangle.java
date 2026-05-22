
import java.util.Scanner;
public class HollowRectangle {


    public static void rect(){
        System.out.println("Enter the size(L,B) of rectangle you want to print: ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();
        for (int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
        
        sc.close();
    }
    public static void main(String args[]){
        rect();
        
    }
}
