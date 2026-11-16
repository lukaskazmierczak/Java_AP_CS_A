package assignments.ch5.section04;

import net.apcs.classes.CoordinatePoint;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class CoordinateCircle_Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        CoordinateCircle c1 = new CoordinateCircle();
        CoordinateCircle c2 = new CoordinateCircle(0, 0, 15);
        System.out.println(c1);
        System.out.println(c2);

        CoordinatePoint pt = new CoordinatePoint(10, 10);
        System.out.println(c1.isInside(pt));
        System.out.println(c2.isInside(pt));
    }
}
