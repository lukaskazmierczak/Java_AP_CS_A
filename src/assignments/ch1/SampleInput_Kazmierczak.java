package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class SampleInput_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int hours;
        double hourp;
        double pay;

        System.out.println("How many hours did you work last week?");
        hours = keyboard.nextInt();
        System.out.println("How much did you make in an hour?");
        hourp = keyboard.nextDouble();

        pay = hours * hourp;

        System.out.println("Your paycheck is $" + pay);
    }
}
