package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//test <= 60
public class Love6_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give an integer:");
        int num1 = keyboard.nextInt();
        System.out.println("Give another integer:");
        int num2 = keyboard.nextInt();
        boolean num = (num1 == 6 || num2 == 6);
        boolean sum = (num1 + num2 == 6);
        boolean diff = (num1 - num2 == 6 || num2 - num1 == 6);
        boolean six = (num || sum || diff);
        System.out.println(six);
    }
}
