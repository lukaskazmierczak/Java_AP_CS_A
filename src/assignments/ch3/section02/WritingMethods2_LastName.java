package assignments.ch3.section02;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class WritingMethods2_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInt("Enter an integer: ");
        int b = getInt("Enter an integer: ");
        int c = getInt("Enter an integer: ");

        double sum = sum(a, b, c);
        double avg1 = avg(sum, 3);
        double avg2 = average(a, b, c);

        printMsgAndNum("Sum is ", sum);
        printMsgAndNum("Average 1 is ", avg1);
        printMsgAndNum("Average 2 is ", avg2);
    }

    private static int getInt(String message) {
        return -1;
    }

    private static double average(int x, int y, int z) {
        return -1;
    }

    private static double avg(double sum, int numOfNums) {
        return -1;
    }

    private static int sum(int x, int y, int z) {
        return -1;
    }

    private static void printMsgAndNum(String message, double number) {

    }

}
