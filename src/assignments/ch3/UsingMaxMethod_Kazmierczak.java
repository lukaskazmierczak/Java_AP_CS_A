package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
At least double the number of lines, It is better because programmers are lazy and want an easy way to do things
 */
public class UsingMaxMethod_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number:");
        double a = keyboard.nextDouble();
        System.out.println("Give a number:");
        double b = keyboard.nextDouble();
        System.out.println("Give a number:");
        double c = keyboard.nextDouble();
        System.out.println("Give a number:");
        double d = keyboard.nextDouble();
        double semi1 = Math.max(a, b);
        double semi2 = Math.max(c, d);
        double champ = Math.max(semi1, semi2);
        System.out.println("The largest of these numbers is " + champ);
    }
}
