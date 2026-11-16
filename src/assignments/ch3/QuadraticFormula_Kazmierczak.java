package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would only find this usful if I was rushing in a test. I think that my teacher would not let me use this because it is too OP.
 */
public class QuadraticFormula_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a:");
        double a = keyboard.nextDouble();
        System.out.println("Give b:");
        double b = keyboard.nextDouble();
        System.out.println("Give c:");
        double c = keyboard.nextDouble();
        int zeros = 0;
        double disc = Math.pow(b, 2)-(4 * a * c);
        if (disc == 0){
            zeros = 1;
        }
        else if (disc < 0){
            zeros = 0;
        }
        else if (disc > 0){
            zeros = 2;
        }
        System.out.println("Real Roots: " + zeros);
        double x1 = ((-1 * b) + disc)/(2*a);
        double x2 = ((-1 * b) - disc)/(2*a);
        if (zeros > 0) {
            if (x1 == x2) {
                System.out.println("x = " + x1);
            }
            else {
                System.out.println("x = " + x1);
                System.out.println("x = " + x2);
            }
        }
    }
}
