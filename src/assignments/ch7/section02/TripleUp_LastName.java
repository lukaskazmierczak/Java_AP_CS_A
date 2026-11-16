package assignments.ch7.section02;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class TripleUp_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples form problem description...
        System.out.println(tripleUp(new int[]{1, 4, 5, 6, 2})); // true
        System.out.println(tripleUp(new int[]{1, 2, 3}));       // true
        System.out.println(tripleUp(new int[]{1, 2, 4}));       // false

        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("tripleUp(a) = " + tripleUp(a));

    }

    private static boolean tripleUp(int[] a) {
        return false;
    }
}
