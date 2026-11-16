package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//The hourly rate could be a decimal if there is a remainder after dividing the paycheck by the hours.
public class CalculateHourlyPay_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double payCheck = 100;
        double hours = 5.5;
        double hourlyRate;
        hourlyRate = payCheck/hours;
        System.out.print("Paycheck: " + payCheck + "\nHours: " + hours + "\nHourly Rate:" + hourlyRate);
    }
}
