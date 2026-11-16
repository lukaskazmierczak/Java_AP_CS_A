package assignments.ch4.EndOfChapter;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Hailstone_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        int number;

        System.out.print("Which option? ");
        option = keyboard.nextInt();

        System.out.print("Number? ");
        number = keyboard.nextInt();

        if (option == 1) {
            // Print the hailstone numbers for a single entry and its length
        } else if (option == 2) {
            // Print all of the hailstone numbers from 4 to a given entry.

        } else { // if (option == 3)
            // Print out the number with the maximum number of iterations need to reach the cycle and which starting number produces this maximum from 4 to the number entered.
        }


    }

    private static int hailStone(int num, boolean showNumbers) {

        return -1;
    }
}
