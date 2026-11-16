package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//5.0 / 2 = 2.5, but 5 / 2 = 2. The difference is that in the first example,
//5.0 is a double while in the second it is an int.
// This is important because when one or more of the numbers in a division problem are doubles,
// the result will be a double, meaning it can include decimals. If both values are ints,
// then the result will be an int and therefore, not include decimals.
public class CalculateSpeed_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double miles = 293;
        double hours = 4.3;
        double avSpeed = miles/hours;
        System.out.print("Average speed: " + avSpeed);

    }
}
