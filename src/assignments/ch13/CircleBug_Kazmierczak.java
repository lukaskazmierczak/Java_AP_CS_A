package assignments.ch13;

import examples.ex13_GridWorld.sec02_BugVariations.BoxBug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class CircleBug_Kazmierczak extends Bug {
    private int total;
    private int steps;

    public CircleBug_Kazmierczak(int size) {
        total = size;
        steps = 0;
    }

    public void act() {
        if (steps < total && canMove()) {
            steps++;
            move();
        }
        if (steps == total) {
            steps = 0;
            setDirection(getDirection() + 45);
        }
    }


    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        CircleBug_Kazmierczak alice = new CircleBug_Kazmierczak(6);
        alice.setColor(Color.ORANGE);
        CircleBug_Kazmierczak bob = new CircleBug_Kazmierczak(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}