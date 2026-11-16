package assignments.ch5.section04;

import java.util.Scanner;



/*  ANSWER QUESTION HERE

 */
public class Scoreboard_Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        info = game.getScore();
        game.recordplay(1);
        info = game.getScore();
        game.recordplay(0);
        info = game.getScore();
        info = game.getScore();
        game.recordplay(3);
        info = game. getScore();
        game.recordplay(1);
        game.recordplay(0);
        info = game.getScore();
        game.recordplay(0);
        game.recordplay(4);
        game.recordplay(0);
        info = game.getScore();
        Scoreboard match = new Scoreboard ("Lions","Tigers");
        info = match. getScore();
        info = game. getScore();
    }
}
