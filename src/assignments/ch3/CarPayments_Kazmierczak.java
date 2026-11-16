package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class CarPayments_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is the price of the car?");
        double car = keyboard.nextDouble();
        System.out.println("How many years are you paying?");
        int payments = keyboard.nextInt() * 12;
        System.out.println("What is the APR?");
        double r = keyboard.nextDouble()/12;
        double num = car * r * Math.pow((1+r), payments);
        double den = Math.pow((1+r), payments)-1;
        System.out.println("You must pay $" + (num/den) + " per month.");
    }
}
