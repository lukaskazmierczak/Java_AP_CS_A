package assignments.ch2.section02;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class ComputingSalaries_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double currentSalary;
        int rating;

        System.out.print("Current Salary: ");
        currentSalary = keyboard.nextDouble();
        System.out.println("Enter Rating:");
        System.out.println("  1.  Excellent");
        System.out.println("  2.  Good");
        System.out.println("  3.  Poor");
        System.out.print("Current Rating: ");
        rating = keyboard.nextInt();

    }
}
