import java.util.Scanner;
public class HollowRectange {

    public static void rectangle(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        for(int i=1; i<= r; i++){
            for (int j=1; j<= c; j++ ){
                if(i == 1 ||i== r || j==1 || j==c){
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
        System.out.println("Enter rows of recttangle: ");
        rectangle();
    }
}
