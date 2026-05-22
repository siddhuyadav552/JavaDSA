public class XtoN {

    public static void ToPower(int number, int power, int result) {
        // Base Case
        if (power >= 1) {
            result = result * number;
            power--;
            ToPower(number, power, result);
        } else {
            System.out.println(result);
            return;
        }

    }

    public static void main(Strin
        g args[]) {
        int number = 5;
        int power = 3;
        int result = 1;

        ToPower(number, power, result);
    }
}
