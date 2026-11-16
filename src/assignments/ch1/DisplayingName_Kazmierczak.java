package assignments.ch1;

import java.sql.SQLOutput;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class DisplayingName_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your first name?");
        String first = keyboard.nextLine();
        System.out.println("What is your middle name?");
        String middle = keyboard.nextLine();
        System.out.println("What is your last name?");
        String last = keyboard.nextLine();

        System.out.println("First, Last: " + first + ", " + last);
        System.out.println("Full name: " + first + ", " + middle + ", " + last);
        System.out.println("Last, First: " + last + ", " + first);
        System.out.println("Last, First Middle: " + last + ", " + first + " " + middle);
    }
}
