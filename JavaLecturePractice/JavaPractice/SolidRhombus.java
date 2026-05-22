import java.util.Scanner;
public class SolidRhombus{
    public static void Rhombus(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++){
        //Space print phele
            for (int j= 1; j<=(n-i); j++){
                System.out.print(" ");
            }
        //Stars printing code
            for(int k=1; k<=n; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }



        sc.close();
        
        }


    public static void main(String args[]){
        System.out.print("Enter Rows: ");
        Rhombus();
    }

}