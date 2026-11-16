package assignments.ch4.section04;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class RewriteGetInt_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int test1 = getInt("Test Score 1: ", 0, 100);
        int test2 = getInt("Test Score 2: ", 0, 100);
        int test3 = getInt("Test Score 3: ", 0, 100);

        System.out.println("Average is " + (test1 + test2 + test3) / 3.0);
    }

    private static int getInt(String prompt, int min, int max) {
        return 0;
    }
}
