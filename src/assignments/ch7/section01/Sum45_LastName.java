package assignments.ch7.section01;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Sum45_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        // Examples from problem description...
        System.out.println(sum45(new int[]{1, 2, 2}));               // 5
        System.out.println(sum45(new int[]{1, 2, 2, 4, 99, 99, 5})); // 5
        System.out.println(sum45(new int[]{1, 1, 4, 5, 2}));         // 4

        // User Interactive Version...
        int[] a = Input.getIntArray();
        System.out.println("sum45(a) = " + sum45(a));

    }

    private static int sum45(int[] a) {
        return 0;
    }
}
