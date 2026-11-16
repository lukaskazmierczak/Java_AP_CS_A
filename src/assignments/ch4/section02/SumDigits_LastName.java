package assignments.ch4.section02;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class SumDigits_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int number;

        System.out.print("Number: ");
        number = keyboard.nextInt();

        int sum = sumDigits(number);

        System.out.println("Sum of the digits of " + number + " is " + sum);

    }

    private static int sumDigits(int num) {
        return 0;
    }
}
