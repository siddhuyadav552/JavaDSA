// public class TowerOfHanoi {

//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if (n == 1) {
//             System.out.println("Transfer disk: " + n + " from " + src + " to " + dest);
//             return;
//         }

//         towerOfHanoi(n - 1, src, dest, helper);
//         System.out.println("Transfer disk: " + n + " from " + src + " to " + dest);
//         towerOfHanoi(n - 1, helper, src, dest);
//     }

//     public static void main(String args[]) {
//         int n = 3;
//         towerOfHanoi(n, "Source tower", "Helper tower", "Destination tower");

//     }
// }


import java.util.*;

public class HanoiIterative {
    
    // Do rods ke beech valid move karne ka logic
    void moveDisks(Stack<Integer> src, Stack<Integer> dest, char s, char d) {
        if (src.isEmpty() && !dest.isEmpty()) {
            src.push(dest.pop());
            System.out.println("Move disk " + src.peek() + " from " + d + " to " + s);
        } else if (dest.isEmpty() && !src.isEmpty()) {
            dest.push(src.pop());
            System.out.println("Move disk " + dest.peek() + " from " + s + " to " + d);
        } else if (!src.isEmpty() && !dest.isEmpty()) {
            if (src.peek() > dest.peek()) {
                src.push(dest.pop());
                System.out.println("Move disk " + src.peek() + " from " + d + " to " + s);
            } else {
                dest.push(src.pop());
                System.out.println("Move disk " + dest.peek() + " from " + s + " to " + d);
            }
        }
    }

    void solveHanoi(int n, char s, char a, char d) {
        Stack<Integer> src = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> dest = new Stack<>();

        // Even number of disks ke liye rods swap
        if (n % 2 == 0) {
            char temp = d;
            d = a;
            a = temp;
        }

        int totalMoves = (int) Math.pow(2, n) - 1;

        // Disks ko source rod mein bharna (Badi niche, Chhoti upar)
        for (int i = n; i >= 1; i--) src.push(i);

        for (int i = 1; i <= totalMoves; i++) {
            if (i % 3 == 1) moveDisks(src, dest, s, d);
            else if (i % 3 == 2) moveDisks(src, aux, s, a);
            else if (i % 3 == 0) moveDisks(aux, dest, a, d);
        }
    }

    public static void main(String[] args) {
        HanoiIterative obj = new HanoiIterative();
        obj.solveHanoi(7, 'S', 'A', 'D'); 
    }
}