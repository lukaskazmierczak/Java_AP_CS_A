package assignments.ch13;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class SpeedBug extends Bug {
    private int speed;
    public SpeedBug(int zoom){
        speed = zoom;
    }
    public void act(){
        for(int i = 0; i < speed; i++){
            if(canMove()){
                move();
            }
            else{
                turn();
            }
        }

    }

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        SpeedBug alice = new SpeedBug(3);
        alice.setColor(Color.ORANGE);
        SpeedBug bob = new SpeedBug(5);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
