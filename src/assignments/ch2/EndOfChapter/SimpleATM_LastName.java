package assignments.ch2.EndOfChapter;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class SimpleATM_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare Variables -> Feel free to add more below
        int input;
        double balance = 150;

        // This is a loop so that your code will repeat over and over
        // and allow you to test your program as if though this were
        // a real ATM.
        do {

            // This is a method call.  It will return the users choice
            // from the menu being printed.  1 is deposit. 2 is withdraw.
            // 3 is check balance. 4 is exit.
            // We are covering methods next chapter. You are not currently
            // responsible for it.
            input = menu();

            // Write Your Code Below Here




            // Write Your Code Above Here
        } while (input != 4);
    }

    private static int menu() {
        int choice;

        System.out.println("**********************");
        System.out.println("* Welcome to the ATM *");
        System.out.println("* 1. Deposit         *");
        System.out.println("* 2. Withdraw        *");
        System.out.println("* 3. Check Balance   *");
        System.out.println("* 4. Exit            *");
        System.out.println("**********************");
        System.out.print("What would you like to do? ");
        do {
            choice = keyboard.nextInt();
        } while (choice < 1 || choice > 4);
        return choice;
    }
}
