package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//Subtraction does not work with strings, you cannot take a string out of a string.
public class MakeTags_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tag:");
        String tag = keyboard.nextLine();
        System.out.println("Word:");
        String word = keyboard.nextLine();
        System.out.println("<" + tag + ">" + word + "<" + tag + ">");
    }
}
