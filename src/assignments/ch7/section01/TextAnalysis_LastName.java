package assignments.ch7.section01;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class TextAnalysis_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String line = Input.getString("Enter a single line of text: ");
        // or String line = "The quick brown fox jumps over the lazy dog.  One, two, buckle your shoe.  Three, four, shut the door.  Five, six, pick up sticks. Seven, eight, lay them straight.  Nine, ten, do it again.";

        String[] words; // Convert the line into an array of words.
        words = new String[4]; // Delete This Line.  It is currently allowing the program to compile.

        int width = Input.getInt("Formatted Width: ");
        // or int width = 25;

        printFormattedWidth(words, width);

        int punctuation = removePunctuation(words);

        // Below here do the analysis part...
    }

    private static void printFormattedWidth(String[] words, int width) {

    }

    private static int removePunctuation(String[] words) {
        return 0;
    }
}
