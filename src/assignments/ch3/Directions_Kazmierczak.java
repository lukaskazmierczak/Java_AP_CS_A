package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
It will loop infinitely
 */
public class Directions_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();
    }
    public static void printMenu(){
        System.out.println("Welcome to Mr. Smith's Egg Emporium!\n" +
                "Egg Pricing is as follows:\n" +
                "0 up to but not including 4 dozen $.50 per dozen\n" +
                "4 up to but not including 6 dozen $0.45 per dozen\n" +
                "6 up to but not including 11 dozen $0.40 per dozen\n" +
                "11 or more dozen $0.35 per dozen\n" +
                "Partial dozens may be purchase, but eggs are charged at 1/10 of the per dozen price.");
    }
}
