package assignments.ch5.section01.coinTossSimulator;

import java.util.Scanner;

public class CoinTossSimulator_Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Create an instance of CoinTossSimulator
        // This is known as an object
        CoinTossSimulator cts = new CoinTossSimulator();
        int headCount = 0;
        int tailCount = 0;

        int numOfTimes;

        System.out.print("How many times would you liek to flip a coin? ");
        numOfTimes = keyboard.nextInt();

        for (int i = 0; i < numOfTimes; i++) {
            // Toss the coin
            cts.toss();

            // Print the status of the coin
            System.out.println(cts.getSideUp());

            // Check to see if the coin is heads or tails

            if (cts.getSideUp().equals("Heads")) {
                headCount++;
            }
            else {
                tailCount++;
            }

        }

        System.out.println("Number of Heads: " + headCount);
        System.out.println("Number of Tails: " + tailCount);
        System.out.println(cts);
    }
}
