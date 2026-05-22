public class Power {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String args[]) {
        int x = 5;
        int n = 4;
        System.out.println(power(x, n));

    }
}

