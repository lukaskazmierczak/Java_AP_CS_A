package assignments.ch3.EndOfChapter;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class CalculatePostage_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        // Examples from Problem Description:
        System.out.println(calculatePostage(5, 1));   // $3.50
        System.out.println(calculatePostage(72, 2));  // $7.50
        System.out.println(calculatePostage(3.5, 2)); // $0.97
        System.out.println(calculatePostage(15, 2));  // $3.50


        // You may want to write your own interactive version
    }

    private static double calculatePostage(double oz, int mailType) {
        return -1;
    }
}
