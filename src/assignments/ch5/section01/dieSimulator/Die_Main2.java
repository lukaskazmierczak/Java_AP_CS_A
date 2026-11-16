package assignments.ch5.section01.dieSimulator;

import java.util.Scanner;
import net.apcs.Input;

/*  ANSWER QUESTION HERE
It would better represent the three dies being rolled rather than rolling one die three times. That way you could perform specific actions with each die.
 */
public class Die_Main2 {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int sideCount = Input.getInt("How many sides does the die have? ");
        Die die = new Die(sideCount);
        die.roll();
        int r1 = die.getValue();
        die.roll();
        int r2 = die.getValue();
        die.roll();
        int r3 = die.getValue();
        System.out.println("Roll 1: " + r1);
        System.out.println("Roll 1: " + r2);
        System.out.println("Roll 1: " + r3);
        System.out.println("Sum: " + (r1 + r2 + r3));


    }
}
