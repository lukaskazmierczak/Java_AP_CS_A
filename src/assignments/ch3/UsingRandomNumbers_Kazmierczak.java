package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
(int)(Math.random()*7+13);
 */
public class UsingRandomNumbers_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Rolling the first die...");
        int d1 = (int)(Math.random()*6+1);
        System.out.println("You rolled a " + d1 + "!");
        System.out.println("Rolling the second die...");
        int d2 = (int)(Math.random()*6+1);
        System.out.println("You rolled a " + d2 + "!");
        System.out.println("Your sum is " + (d1 + d2));
    }
}
