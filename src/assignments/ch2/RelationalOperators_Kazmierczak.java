package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//True, False
public class RelationalOperators_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give an integer:");
        int num1 = keyboard.nextInt();
        System.out.println("Give an integer:");
        int num2 = keyboard.nextInt();
        System.out.println("Give an integer:");
        int num3 = keyboard.nextInt();
        boolean sum = (num1 + num2 > num3);
        System.out.println(sum);
    }
}
