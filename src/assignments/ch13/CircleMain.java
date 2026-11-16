package assignments.ch13;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class CircleMain {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        Bug alice = new Bug();
        alice.setColor(Color.ORANGE);
        CircleBug_Kazmierczak bob = new CircleBug_Kazmierczak(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
