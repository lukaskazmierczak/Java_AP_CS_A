package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
It is an unnessesarily difficult way to solve for the area of a triangle.
 */
public class Semiperimeter_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a side length:");
        double a = keyboard.nextDouble();
        System.out.println("Give a side length:");
        double b = keyboard.nextDouble();
        System.out.println("Give a side length:");
        double c = keyboard.nextDouble();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("The area is " + area);
    }
}
