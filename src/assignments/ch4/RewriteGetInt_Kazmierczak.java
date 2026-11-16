package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
many more, I might consider using a loop within a loop to repeat the process three times (one for each test)
 */
public class RewriteGetInt_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int test1 = getInt("Test Score 1: ", 0, 100);
        int test2 = getInt("Test Score 2: ", 0, 100);
        int test3 = getInt("Test Score 3: ", 0, 100);

        System.out.println("Average is " + (test1 + test2 + test3) / 3.0);
    }
    private static int getInt(String prompt, int min, int max){
        int num;
        do {
            System.out.println("Give an int between 0 - 100");
            num = keyboard.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("You silly billy. Enter a number correctly this time.");
            }
        }
        while (num < 0 || num > 100);
        System.out.println("Good boy.");
        return num;

    }
}
