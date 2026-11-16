package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
// B && C
public class LogicalOperators2_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your grade?");
        double grade = keyboard.nextDouble();
        System.out.println("How much are you willing to bribe?");
        int bribe = keyboard.nextInt();
        boolean pass = (grade >= 98) || (grade >= 90 && bribe >= 50) || (bribe >= 100);
        System.out.println(pass);
    }
}
