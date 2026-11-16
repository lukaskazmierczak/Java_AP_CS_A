package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//Yes, my friends are not programmers
public class OrderAPIzza_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How much for a pizza?");
        double cost = keyboard.nextDouble();
        System.out.println("How many pizzas?");
        int pizza = keyboard.nextInt();
        System.out.println("How many people are buying?");
        int people = keyboard.nextInt();
        double total = cost * pizza;
        double av = total / people;
        System.out.println("The total bill is: " + total + "\nEach person must pay: " + av);
    }
}
