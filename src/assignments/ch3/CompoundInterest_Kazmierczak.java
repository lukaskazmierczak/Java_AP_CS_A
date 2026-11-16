package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Math.abs and Math.max
 */
public class CompoundInterest_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How much money do you want to invest?");
        double initial = keyboard.nextDouble();
        System.out.println("How much is your annual interest rate?");
        double rate = keyboard.nextDouble();
        System.out.println("How many times does your money compound per year?");
        int comp = keyboard.nextInt();
        System.out.println("How long do you want to invest?");
        int year = keyboard.nextInt();

        double sub = initial * (1+(rate/comp));
        double total = Math.pow(sub, (comp * year));
        System.out.println("You will have $" + total + " after " + year + " years.");

    }
}
