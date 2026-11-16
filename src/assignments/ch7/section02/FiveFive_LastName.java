package assignments.ch7.section02;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class FiveFive_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples form problem description...
        System.out.println(fiveFive(new int[]{4, 5, 5, 3})); // true
        System.out.println(fiveFive(new int[]{5, 5, 4}));    // true
        System.out.println(fiveFive(new int[]{5, 5, 4, 5})); // false

        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("fiveFive(a) = " + fiveFive(a));

    }

    private static boolean fiveFive(int[] a) {
        return false;
    }
}
