package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
// It makes the program interactive
public class CalculateHourlyPay2_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How much did you earn on your last paycheck?");
        double amount = keyboard.nextDouble();
        System.out.println("How many hours did you work?");
        double hours = keyboard.nextDouble();;
        double rate = amount/hours;
        System.out.println("Average rate: " + rate);

    }
}
