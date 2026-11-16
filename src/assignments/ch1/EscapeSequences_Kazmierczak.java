package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
// Escape sequences are important because certain characters cannot be put in a string.
// The escape sequences serve as substitutes and allow these characters to be used.
// For example, a quote cannot be used in a string because it would end the string, so I can use \" to show a quote within a string.
public class EscapeSequences_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("The quick\nbrown fox\n\"jumps\" over the\nlazy dog.");
    }
}
