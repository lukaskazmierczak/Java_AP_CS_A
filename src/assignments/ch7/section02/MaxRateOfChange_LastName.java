package assignments.ch7.section02;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class MaxRateOfChange_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples form problem description...
        System.out.println(maxRateOfChange(new int[]{1, 2, 4, 8, 16, 32}));               // returns 16
        System.out.println(maxRateOfChange(new int[]{32, 16, 8, 4, 2, 1}));               // returns 16
        System.out.println(maxRateOfChange(new int[]{1, 2, 1, 3, 1, 4, 1, 3, 1, 2, 1}));  // returns 3

        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("maxRateOfChange(a) = " + maxRateOfChange(a));

    }

    private static int maxRateOfChange(int[] a) {
        return 0;
    }
}
