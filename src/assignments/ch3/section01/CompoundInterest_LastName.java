package assignments.ch3.section01;

import java.util.Scanner;
import net.apcs.Input;

/*  ANSWER QUESTION HERE

 */
public class CompoundInterest_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double p = Input.getDouble("How much money are you investing? ");
        double r = Input.getDouble("Interest Rate as percent (ex. 3.25%): ") / 100;
        int n = Input.getInt("Number of compounded periods per year: ");
        int t = Input.getInt("Enter the number of years");

        double a;
    }
}
