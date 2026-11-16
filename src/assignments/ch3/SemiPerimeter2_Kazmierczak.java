package assignments.ch3;

import net.apcs.classes.CoordinatePoint;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
otherwise I would have to write out the distance formula for every x and y point as well as use getX and getY to even get those points.
 */
public class SemiPerimeter2_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        CoordinatePoint a = getPoint();
        CoordinatePoint b = getPoint();
        CoordinatePoint c = getPoint();
        double area = area(a,b,c);
        System.out.println("The area is " + area);

    }
    private static CoordinatePoint getPoint(){
        System.out.println("x value:");
        double x = keyboard.nextDouble();
        System.out.println("y value:");
        double y = keyboard.nextDouble();
        return new CoordinatePoint(x, y);

    }
    private static double area(CoordinatePoint a, CoordinatePoint b, CoordinatePoint c){
        double al = a.distance(b);
        double bl = b.distance(c);
        double cl = c.distance(a);
        double s = (al + bl + cl)/2;
        return Math.sqrt(s*(s-al)*(s-bl)*(s-cl));

    }
}
