package assignments.ch7.section02;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class PeakCount_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples form problem description...
        System.out.println(peakCount(new int[]{1, 2, 3, 4, 5, 6, 7})); // returns 0
        System.out.println(peakCount(new int[]{1, 2, 1, 4, 1, 6, 1})); // returns 3
        System.out.println(peakCount(new int[]{1, 2, 3, 5, 3, 2, 1})); // returns 1

        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("peakCount(a) = " + peakCount(a));

    }

    private static int peakCount(int[] a) {
        return 0;
    }
}
