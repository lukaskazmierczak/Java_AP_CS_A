package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
// Yes, It is very important that dates are coded correctly because if they arent, they cause errors. Like Y2K scare
public class IsDateValid_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int month, day, year;

        System.out.print("What is the month? ");
        month = keyboard.nextInt();

        System.out.print("What is the day? ");
        day = keyboard.nextInt();

        System.out.print("What is the year? ");
        year = keyboard.nextInt();

        if (year < 1562 || year > 9999) {
            System.out.println("The year is not valid");
            System.exit(0);
        }

        if (month == 2) {
            // Stupid February
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                // It's a leap year
                if (day >= 1 && day <= 29) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("Invalid Date. Invalid Day.");
                }
            } else {
                // It's not a leap year
                if (day >= 1 && day <= 28) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("Invalid Date. Invalid Day.");
                }
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            // 30 day month
            if (day >= 1 && day <= 30)
                System.out.println("Valid Date.");
            else
                System.out.println("Invalid Date. Invalid Day.");
        } else if (month == 1 || month == 3 || month == 5
                || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 0 && day < 32)
                System.out.println("Valid Date.");
            else
                System.out.println("Invalid Date. Invalid Day.");
        } else {
            System.out.println("Invalid Date. Invalid Month.");
        }


    }
}
