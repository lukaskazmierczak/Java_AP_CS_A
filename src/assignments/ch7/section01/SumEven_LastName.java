package assignments.ch7.section01;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class SumEven_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        // Examples from problem description...
        System.out.println(sumEven(new int[]{1, 2, 3, 4}));  // 6
        System.out.println(sumEven(new int[]{5, 11, 2, 8})); // 10
        System.out.println(sumEven(new int[]{7, 0, 0, 9}));  // 0

        // User Interactive Version...
        int[] a = Input.getIntArray();
        System.out.println("sumEven(a) = " + sumEven(a));

    }

    private static int sumEven(int[] a) {
        return 0;
    }
}
