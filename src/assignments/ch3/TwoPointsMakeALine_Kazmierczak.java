package assignments.ch3;

import net.apcs.classes.CoordinatePoint;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would find the y coordinate of the point on the line that has the same x-value. Then i would find the difference between my new y-value and the y-value of point c. Using this, I would be able to add the difference to my b value in the equation to find the perpendicular one.
 */
public class TwoPointsMakeALine_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give x for point a");
        double ax = keyboard.nextDouble();
        System.out.println("Give y for point a");
        double ay = keyboard.nextDouble();
        System.out.println("Give x for point b");
        double bx = keyboard.nextDouble();
        System.out.println("Give y for point b");
        double by = keyboard.nextDouble();
        CoordinatePoint a = new CoordinatePoint(ax, ay);
        CoordinatePoint b = new CoordinatePoint(bx, by);
        double slope = a.slope(b);
        double constant = ay - (slope * ax);
        System.out.println("The equation of the line connecting these two points is y = " +slope+ "x + " + constant);
    }
}
