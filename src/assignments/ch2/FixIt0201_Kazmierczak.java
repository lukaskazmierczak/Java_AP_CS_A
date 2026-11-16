package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
// double check basic info, I put + instead of * sometimes
public class FixIt0201_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give an integer:");
        int num1 = keyboard.nextInt();
        System.out.println("Give an integer:");
        int num2 = keyboard.nextInt();
        System.out.println("Give an integer:");
        int num3 = keyboard.nextInt();
        if (((num1 * num1) + (num2 * num2)) == (num3 * num3)){
            System.out.println("Pythagorean Triple");
        }
        else if (((num2 * num2) + (num3 * num3)) == (num1 * num1)){
            System.out.println("Pythagorean Triple");
        }
        else if (((num1 * num1) + (num3 * num3)) == (num2 * num2)){
            System.out.println("Pythagorean Triple");
        }
        else{
            System.out.println("Not a Pythagorean Triple");
        }


    }
}
