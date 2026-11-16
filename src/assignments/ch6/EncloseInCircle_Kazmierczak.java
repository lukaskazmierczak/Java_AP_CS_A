package assignments.ch6;

import net.apcs.classes.CoordinatePoint;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
They allow me to double check that my code works
 */
public class EncloseInCircle_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many points would you like?");
        int pts = keyboard.nextInt();
        CoordinatePoint[] a =getPoints(pts);
        printPoints(a);
        System.out.println(smallestRadius(a));

    }
    private static CoordinatePoint[] getPoints(int num){
        CoordinatePoint[] array = new CoordinatePoint[num];
        for(int i = 0; i < num; i++){
            int x = (int)(Math.random()*2000-1000);
            int y = (int)(Math.random()*2000-1000);
            array[i] = new CoordinatePoint(x, y);
        }
        return array;
    }

    private static void printPoints(CoordinatePoint[] pts){
        for(int j = 0; j < pts.length; j++){
            System.out.println(pts[j]);
        }
    }

    private static double smallestRadius(CoordinatePoint[] pts){
        double radius = 0;
        for(int k = 0; k < pts.length; k++){
            for(int u = 0; u < pts.length; u++){
                if(pts[u].distance(pts[k]) > radius){
                    radius = pts[u].distance(pts[k]);
                }
            }
        }
        return radius;
    }

}
