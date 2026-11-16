package assignments.ch7.section02;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Either19_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples form problem description...
        System.out.println(either19(new int[]{4, 1, 1}));       // true
        System.out.println(either19(new int[]{9, 9, 1}));       // true
        System.out.println(either19(new int[]{9, 9, 7, 1, 1})); // false

        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("either19(a) = " + either19(a));
    }

    private static boolean either19(int[] a) {
        return false;
    }
}
