package assignments.ch1;

import net.apcs.classes.CoordinatePoint;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
// I could find what kind of shape, area, and perimeter
public class RectangleCoodinates_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        CoordinatePoint tl, tr, bl, br;

        System.out.println("Given an x: ");
        double x = keyboard.nextDouble();

        System.out.println("Given an y: ");
        double y = keyboard.nextDouble();

        System.out.println("Length? ");
        double length = keyboard.nextDouble();

        System.out.println("Width? ");
        double width = keyboard.nextDouble();

        tl = new CoordinatePoint(x, y);
        tr = new CoordinatePoint(x + width, y);
        bl = new CoordinatePoint(x, y- length);
        br = new CoordinatePoint(x + width, y - length);

        double Perimeter = 2 * length + 2 * width;
        double Area = length * width;

        System.out.println(tl);
        System.out.println(tr);
        System.out.println(br);
        System.out.println(bl);
        System.out.println("Perimeter: " + Perimeter);
        System.out.println("Area: " + Area);
    }
}
