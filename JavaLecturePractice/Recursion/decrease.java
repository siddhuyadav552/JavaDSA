public class decrease {

    public static void dec(int number) {
        if (number == 20) {
            System.out.print(number + " ");
            return;
        }

        dec(number+1);
        System.out.print(number + " ");

    }

    public static void main(String args[]) {
        int number  = 1;
        dec(number);

    }
}
