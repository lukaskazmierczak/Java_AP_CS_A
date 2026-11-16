package assignments.ch13;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class ZBug extends Bug {
    private int steps;
    private int big;
    private int count;
    public ZBug(int size){
        setDirection(90);
        steps = 0;
        big = size;
        count = 0;
    }
    public void act(){
        if(!canMove()){
            turn();
            move();
            steps = 0;
            setDirection(90);
        }
        else if(steps < big){
            move();
            steps++;
        }
        else if(steps == big && count == 0){
            steps = 0;
            count++;
            turn();
            turn();
            turn();
        }
        else if(steps == big && count == 1){
            steps = 0;
            count++;
            turn();
            turn();
            turn();
            turn();
            turn();
        }
        else if(steps == big && count == 2){
            count++;
        }
    }
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        ZBug alice = new ZBug(6);
        alice.setColor(Color.ORANGE);
        ZBug bob = new ZBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
