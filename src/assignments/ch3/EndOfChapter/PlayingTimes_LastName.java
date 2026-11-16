package assignments.ch3.EndOfChapter;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class PlayingTimes_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("findBestFit(2,2,6):  " + findBestFit(2,2,6));
        System.out.println("findBestFit(3,2,6):  " + findBestFit(3,2,6));
        System.out.println("findBestFit(2,2,3):  " + findBestFit(2,2,3));
        System.out.println("findBestFit(2,3,6):  " + findBestFit(2,3,6));
        System.out.println("findBestFit(4,3,6):  " + findBestFit(4,3,6));
        System.out.println("findBestFit(3,4,6):  " + findBestFit(3,4,6));
        System.out.println("findBestFit(7,4,6):  " + findBestFit(7,4,6));
        System.out.println("findBestFit(4,7,6):  " + findBestFit(4,7,6));
        System.out.println("findBestFit(7,7,6):  " + findBestFit(7,7,6));
    }

    private static int findBestFit(int t1, int t2, int t) {
        return -1;
    }
}
