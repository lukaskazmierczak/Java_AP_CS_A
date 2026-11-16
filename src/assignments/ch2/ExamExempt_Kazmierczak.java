package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//Three because thereare four possible scearios, either you are exempt using one of the three methods or you are not exempt
public class ExamExempt_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your grade?");
        double grade = keyboard.nextDouble();
        System.out.println("How many absences");
        int absences = keyboard.nextInt();
        if (grade > 95){
            System.out.println("You are exempt");
        }
        else if (grade > 90 && absences < 3){
            System.out.println("You are exempt");
        }
        else if (absences == 0){
            System.out.println("You are exempt");
        }
        else{
            System.out.println("You are not exempt");
        }
    }
}
