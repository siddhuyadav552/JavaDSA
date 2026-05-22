import java.util.Scanner;
class Solution {
    public static void myPow() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        double num = sc.nextDouble();
        System.out.print("Enter the power of value: ");
        int n = sc.nextInt();
        double result= 1 ;
        for(int i= 1; i<=n; i++){
            result = result * num;
        }
        System.out.print(result);
        sc.close();
        
    }

    public static void main(String args[]){
        
        myPow();
    }
}