public class Factorial {
    
    // static int product = 1;
    
    public static void fact(int n, int product){
        if(n == 1){
            System.out.println(product);
            product=1;
            return;
        }
        product = n*product;
        fact(n-1, product);
    }

    public static void main(String args[]){

        int product = 1; 
        fact(6, product);
        fact(5, product);

    }
}



