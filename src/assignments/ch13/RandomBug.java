package assignments.ch13;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class RandomBug extends Bug {
    private int steps;
    private int max;
    private int turns;
    private int maxt;
    public RandomBug(){
        steps = 0;
        max = (int)(Math.random()*10 + 1);
        turns = 0;
        maxt = (int)(Math.random()*8 + 1);
    }
    public void act(){
        if(steps < max){
            move();
            steps++;
        }
        else if(steps == max && turns < maxt){
            turn();
            turns++;
        }
        else if(steps == max && turns == maxt){
            steps = 0;
            turns = 0;
            max = (int)(Math.random()*10 + 1);
            maxt = (int)(Math.random()*8 + 1);
        }
    }
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        RandomBug alice = new RandomBug();
        alice.setColor(Color.ORANGE);
        RandomBug bob = new RandomBug();
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
