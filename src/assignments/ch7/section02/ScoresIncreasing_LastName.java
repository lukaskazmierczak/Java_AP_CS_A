package assignments.ch7.section02;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class ScoresIncreasing_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples form problem description...
        System.out.println(scoresIncreasing(new int[]{1, 3, 4})); // true
        System.out.println(scoresIncreasing(new int[]{1, 3, 2})); // false
        System.out.println(scoresIncreasing(new int[]{1, 1, 4})); // true

        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("scoresIncreasing(a) = " + scoresIncreasing(a));

    }

    private static boolean scoresIncreasing(int[] a) {
        return false;
    }
}
