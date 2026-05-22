public class FibonacciTail {

    public static void fibo(int n, int index, int a, int b){
        if(index == n){
            return;
        }
        if(index<= n){
            System.out.print(a + " ");
            index++;
            fibo(n, index, b, a+b);
        }

    }


    public static void main(String[] args) {
        fibo(8, 0, 0, 1);
    }
}


public class FibonacciHead {

    public static void fibo(int n, int index, int a, int b) {

        if (index == n) {
            return;
        }

        fibo(n, index + 1, b, a + b); 

        System.out.print(a + " ");     
    }

    public static void main(String[] args) {
        fibo(10, 0, 0, 1);
    }
}