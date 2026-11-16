package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//one line, the one that defines amount
public class BusProgram2_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        final int amount = 40;
        System.out.println("How many people?");
        int people = keyboard.nextInt();
        int bus = people / amount;
        if (people % amount != 0){
            bus = bus + 1;
        }
        System.out.println("You will need " + bus + " buses");
    }
}
