package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would need to know what state I was in by using input
 */
public class WritingMethods_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double total; double payment;
        double changeOwed;
        double tax;  total = 15;
        payment = 20;
        tax = salesTax(total);
        changeOwed = change(total + tax, payment);
        System.out.printf("Sales Tax: $%.2f \nChange Owed: $%.2f \n", tax, changeOwed);
        total = 12.25;
        payment = 20;
        tax = salesTax(total);
        changeOwed = change(total + tax, payment);
        System.out.printf("Sales Tax: $%.2f \nChange Owed: $%.2f \n", tax, changeOwed);

    }
    public static double salesTax(double amount){
        return amount * 0.06;
    }
    public static double change(double total, double pay){
        return pay - total;
    }
}
