package assignments.ch7.section04;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class MaxSpan_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples from problem description...
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));  // true
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));  // false
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));         // true

        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("canBalance(a) = " + maxSpan(a));
    }

    private static boolean maxSpan(int[] a) {
        return false;
    }
}
