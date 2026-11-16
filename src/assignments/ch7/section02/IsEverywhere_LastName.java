package assignments.ch7.section02;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class IsEverywhere_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples form problem description...
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 1));    // true
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 2));    // false
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 4}, 1)); // false

        // User interactive version...
        int[] a = Input.getIntArray();
        int n = Input.getInt("num? ");
        System.out.println("isEverywhere(a, n) = " + isEverywhere(a, n));

    }

    private static boolean isEverywhere(int[] a, int num) {
        return false;
    }
}
