package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
9, I occasionally run into errors that take some time but I always know what im doing.
 */
public class FixIt0302_FixMethods_Kazmierczak {
    /*    Don't change any code from here . . . */
    public static Scanner console = new Scanner(System.in);

    public static void main(String [] ars)
    {
        double x1;
        double y1;
        double x2;
        double y2;
        double m;
        double diffX;
        double diffY;
        double d;

        x1 = getDouble("x1=? ");
        y1 = getDouble("y1=? ");
        x2 = getDouble("x2=? ");
        y2 = getDouble("y2=? ");

        diffX = difference(x1,x2);
        diffY = difference(y1,y2);
        m = slope(diffY, diffX);

        d = dist(x1, y1, x2, y2);

        System.out.println("Slope = " + m);

        System.out.println("Dist = " + d);
    }
        //  . . . to here !!!!!!!!

    public static double getDouble(String msg)
    {
        double num;
        System.out.print(msg);
        num = console.nextDouble();
        return num;
    }

    public static double difference(double num1, double num2)
    {
        return num2 - num1;
    }

    public static double dist(double x1, double y1, double x2, double y2)
    {
        double deltaX = difference(x2, x1);
        double deltaY = difference(y2, y1);
        double distance = Math.sqrt( deltaX * deltaX + deltaY * deltaY );
        return distance;
    }

    public static double slope(double changeInY, double changeInX)
    {
        return changeInY / changeInX;
    }


}


/*
You will Enter the following Input
2
2
5
6
The output of the entire program is...
x1=? 2
y1=? 2
x2=? 5
y2=? 6
Slope = 1.3333333333333333
Dist = 5.0
Press any key to continue . . .
*/

