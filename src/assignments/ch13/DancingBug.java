package assignments.ch13;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class DancingBug extends Bug {
    private int[] a;
    private int item;
    public DancingBug(int[] list){
        a = list;
        item = 0;
    }
    public void act(){
        if(item == a.length-1){
            for(int i = 0; i < a[item]; i++){
                turn();
            }
            move();
            item = 0;
        }
        else{
            for(int i = 0; i < a[item]; i++){
                turn();
            }
            move();
            item++;
        }
    }
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 6, 3, 9, 1, 1, 6};
        ActorWorld world = new ActorWorld();
        DancingBug alice = new DancingBug(a);
        alice.setColor(Color.ORANGE);
        DancingBug bob = new DancingBug(a);
        world.add(new Location(7, 8), alice);
        world.show();
    }
}
