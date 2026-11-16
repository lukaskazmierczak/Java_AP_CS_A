package assignments.ch13;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class PlusBug extends Bug {
    private int length;
    private int steps;
    private int direction;
    private int count;
    public PlusBug(int len){
        length = len;
        steps = 0;
        count = 0;
        direction = 0;
    }
    public void act(){
        if(canMove()) {
            if (steps < length) {
                steps++;
                move();
            } else if (steps == length && count < 2) {
                turn();
                turn();
                steps = 0;
                count++;
            } else {
                turn();
                turn();
                turn();
                turn();
                turn();
                turn();
                steps = 0;
                count = 0;
            }
        }
    }
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        PlusBug alice = new PlusBug(6);
        alice.setColor(Color.ORANGE);
        PlusBug bob = new PlusBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
