public class increasingorder {

    public static void incOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        incOrder(n - 1);
        System.out.println(n);

    }

    
    public static void main(String args[]) {
        incOrder(20);

    }
}
