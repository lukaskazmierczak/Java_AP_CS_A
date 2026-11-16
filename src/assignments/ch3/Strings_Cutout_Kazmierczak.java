package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Make a while loop
 */
public class Strings_Cutout_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a string:");
        String str = keyboard.nextLine();
        System.out.println("What part would you like to remove?");
        String cutout = keyboard.nextLine();
        System.out.println(cutOut(str, cutout));

    }
    private static String cutOut(String str, String cutout){

        String before = str.substring(0, str.indexOf(cutout));
        String after = str.substring(str.indexOf(cutout)+cutout.length());
        return before + after;
    }
}
