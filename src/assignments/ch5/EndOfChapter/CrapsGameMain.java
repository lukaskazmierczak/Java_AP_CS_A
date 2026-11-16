package assignments.ch5.EndOfChapter;

import java.util.Scanner;

public class CrapsGameMain {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        CrapsGame crapsGame = new CrapsGame();

        int numWins = 0;
        int numLoss = 0;
        int numPush = 0;

        for (int i = 0; i < 1000; i++) {
            crapsGame.play();
            if (crapsGame.getStatus().equalsIgnoreCase("Winner"))
                numWins++;
            else if (crapsGame.getStatus().equalsIgnoreCase("Loser"))
                numLoss++;
            else
                numPush++;
        }

        System.out.println("Winners: " + numWins);
        System.out.println("Losers : " + numLoss);
        System.out.println("Pushes : " + numPush);
    }
}
