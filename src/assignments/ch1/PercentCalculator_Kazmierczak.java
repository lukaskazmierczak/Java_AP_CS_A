package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class PercentCalculator_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many points did you earn on the assignment?");
        double score = keyboard.nextDouble();
        System.out.println("How many points was the assignment worth?");
        double total = keyboard.nextDouble();
        double grade = (score/total)*100;
        System.out.println("Your score was %" + grade);
    }
}
//Multiply by 100 so that there is no decimal on the grade percentage.