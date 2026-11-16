package assignments.ch5.section04;

import net.apcs.classes.CoordinatePoint;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class CoordinateCircle {

    private static Scanner keyboard = new Scanner(System.in);

        private CoordinatePoint Center;
        private double Radius;

    public CoordinateCircle() {
            Radius = (int)(Math.random() * 101 + 100);
            double x = (int)(Math.random() * 101 - 50);
            double y = (int)(Math.random() * 101 - 50);
            Center = new CoordinatePoint(x, y);
        }

    public CoordinateCircle(CoordinatePoint center) {
            Center = new CoordinatePoint(center);
            Radius = 10;
        }

    public CoordinateCircle(double x, double y, double r) {
            Center = new CoordinatePoint(x, y);
            Radius = r;
        }

        public CoordinatePoint getCenter() {
            return Center;
        }

        public double getRadius() {
            return Radius;
        }

        public double getCenterX() {
            return Center.getX();
        }

        public double getCenterY() {
            return Center.getY();
        }

        public boolean isInside(CoordinatePoint other) {
            return Center.distance(other) < Radius;
        }

        @Override
        public String toString() {
            return "CoordinateCircle{" +
                    "Center=" + Center +
                    ", Radius=" + Radius +
                    '}';
        }
}
