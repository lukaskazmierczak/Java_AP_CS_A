package assignments.ch5.section04;

import net.apcs.classes.CoordinatePoint;
import net.apcs.classes.Rectangle;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Good, I am ready for the exam.
 */
public class CPRectangle_Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        CPRectangle defaultRectangle = new CPRectangle();
        CPRectangle someRectangle = new CPRectangle(new CoordinatePoint(2, 4), 5, 10);
        CPRectangle cpRect = new CPRectangle(3, 5, 2, 3);
        CPRectangle rect = new CPRectangle(new CoordinatePoint(0, 0), new Rectangle(10, 5));
        CPRectangle someRectangleOverX = someRectangle.reflectX();
        CPRectangle someRectangleOverY = someRectangle.reflectY();

        System.out.println("Rectangles...");
        System.out.println("  defaultRectangle = " + defaultRectangle);
        System.out.println("  cpRect = " + cpRect);
        System.out.println("  rect = " + rect);
        System.out.println("  someRectangle = " + someRectangle);
        System.out.println("  someRectangleOverX = " + someRectangleOverX);
        System.out.println("  someRectangleOverY = " + someRectangleOverY);


        System.out.println("Corners of someRectangle");
        System.out.println("  someRectangle.getTopLeft() = " + someRectangle.getTopLeft());
        System.out.println("  someRectangle.getTopRight() = " + someRectangle.getTopRight());
        System.out.println("  someRectangle.getBottomLeft() = " + someRectangle.getBottomLeft());
        System.out.println("  someRectangle.getBottomRight() = " + someRectangle.getBottomRight());

        CoordinatePoint origin = new CoordinatePoint(0, 0);

        System.out.println("Is the origin in any of the rectangles");
        System.out.println("  defaultRectangle.isInside(origin) = " + defaultRectangle.isInside(origin));
        System.out.println("  someRectangle.isInside(origin) = " + someRectangle.isInside(origin));
        System.out.println("  someRectangleOverX.isInside(origin) = " + someRectangleOverX.isInside(origin));
        System.out.println("  someRectangleOverY.isInside(origin) = " + someRectangleOverY.isInside(origin));
    }
}
