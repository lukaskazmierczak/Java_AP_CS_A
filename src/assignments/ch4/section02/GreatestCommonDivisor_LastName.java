package assignments.ch4.section02;

import java.util.Scanner;

import static net.apcs.Input.getInt;

/*  ANSWER QUESTION HERE

 */
public class GreatestCommonDivisor_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt("Number 1: ");
        int num2 = getInt("Number 2: ");
        int gcd = findGCD(num1, num2);

        System.out.println("Greatest common divisor of " + num1 + " and " + num2 + " is " + gcd);


        // Extra Tests...
        //System.out.println(findGCD(25, 15)); // 5
        //System.out.println(findGCD(15, 25)); // 5
    }

    private static int findGCD(int a, int b) {
        return 0;
    }
}
