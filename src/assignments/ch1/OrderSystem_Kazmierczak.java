package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//the tax rate will not change (probably)!
public class OrderSystem_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double tax = .06;
        System.out.println("How many burgers?");
        double burg = keyboard.nextInt() * 1.69;
        System.out.println("How many fries?");
        double fry = keyboard.nextInt() * 1.09;
        System.out.println("How many sodas?");
        double soda = keyboard.nextInt() * .99;
        double sub = burg + fry + soda;
        double taxTotal = sub * tax;
        double total = sub + taxTotal;
        System.out.println("Subtotal: $" + sub);
        System.out.println("The amount you will be taxed is $" + taxTotal);
        System.out.println("Your total is " + (total));
        System.out.println("How much will you pay with?");
        double pay = keyboard.nextDouble();
        System.out.println("Your change is " + (pay - total));



    }
}
