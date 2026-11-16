package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//You cannot subtract from a string so hello3 - 1 gives an error
public class HelloName_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = keyboard.nextLine();

        System.out.println("Hello " + name + "!");
    }
}
