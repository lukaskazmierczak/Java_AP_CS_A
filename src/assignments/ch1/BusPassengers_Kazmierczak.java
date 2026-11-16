package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//42 % 10 = 2, 42 / 10 = 4, % gives the remainder of the division problem,
// / divides and truncates the integer solution.
public class BusPassengers_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many people are on the buses?");
        int people = keyboard.nextInt();
        int remainder = people % 40;
        int buses = people / 40;
        System.out.println(people + " passengers will require " + buses + ", with " + (40 * buses) + " people traveling on those buses, but there will be " + remainder + " people unaccounted for.");
    }
}
