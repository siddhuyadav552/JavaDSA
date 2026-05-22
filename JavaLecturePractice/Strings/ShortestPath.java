package Strings;

import java.util.*;

public class ShortestPath {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i <= path.length() - 1; i++) {
            char dir = path.charAt(i); // ye btayga ki (i) me character konsa hai chal rha hai current me
            // South
            if (dir == 'S' || dir == 's') {
                y--;
            }
            // North
            else if (dir == 'N' || dir == 'n') {
                y++;
            }

            // East
            else if (dir == 'E' || dir == 'e') {
                x++;
            }

            // West
            else if (dir == 'W' || dir == 'w') {
                x--;
            }

        }

        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String path = "EWNSeeeEEE";
        System.out.println(getShortestPath(path));

        sc.close();
    }

}
