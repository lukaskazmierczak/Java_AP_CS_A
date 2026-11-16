package assignments.ch13;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class SpiralBug extends Bug {
    private int steps;
    private int max;
    public SpiralBug(){
        max = 1;
        steps = 0;
    }
    public void act(){
        if(steps < max && canMove()){
            move();
            steps++;
        }
        else{
            turn();
            max++;
            steps = 0;
        }
    }
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        SpiralBug alice = new SpiralBug();
        alice.setColor(Color.ORANGE);
        SpiralBug bob = new SpiralBug();
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
