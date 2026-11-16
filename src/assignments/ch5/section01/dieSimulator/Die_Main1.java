package assignments.ch5.section01.dieSimulator;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Yes, I would have to set the die to the number of numbers on the wheel and check if user's num == output num.
 */
public class Die_Main1 {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Die numberCube = new Die();
        int twosInARow = 0;
        int totalTwos = 0;
        int count = 0;


        // Keep rolling until you get 3 twos in a row
        while(twosInARow < 3) {
            numberCube.roll();
            count += 1;
            System.out.println(numberCube.getValue());

            // Check to see if the result is a two
            if (numberCube.getValue() == 2) {
                totalTwos += 2;

                twosInARow += 1;
            } else {
                twosInARow = 0;

            }
        }


        System.out.println("Total rolls : " + count);
        System.out.println("Number of 2s: " + totalTwos);
    }
}
