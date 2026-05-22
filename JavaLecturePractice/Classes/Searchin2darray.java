import java.util.Scanner;
public class Searchin2darray {

    public static void main(String args[]){

        int matrix [][] = new int [4][4];

        //Esme values store karai hai


        Scanner sc = new Scanner(System.in);
        for( int i=0; i< matrix.length; i++ ){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print("Enter the value of place: " + i + " " + j +" :");
                matrix[i][j] = sc.nextInt();

            }
        }

        // Now searching value on every position of matrix

        System.out.print("Enter the value you want to search : ");
        int targetValue = sc.nextInt();

        for(int i= 0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(targetValue == matrix[i][j]){
                    System.out.print("Value  found");
                }
                
            }
            
        }
        sc.close();

    }
    
}
