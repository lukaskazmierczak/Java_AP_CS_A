package assignments.ch6.EndOfChapter;

import net.apcs.classes.CoordinatePoint;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Polygon_Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Polygon a = new Polygon();

        a.addPoint(new CoordinatePoint(1, 1));
        a.addPoint(new CoordinatePoint(1, -4));
        a.addPoint(new CoordinatePoint(3, -5));
        a.addPoint(new CoordinatePoint(0, 0));

        a.setPoint(3, new CoordinatePoint(3, -2));

        for (int i = 0; i < 4; i++) {
            System.out.println(a.getPoint(i));
        }

        System.out.println(a.perimeter());
        System.out.println(a.area());


    }
}
