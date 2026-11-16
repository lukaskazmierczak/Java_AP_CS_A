package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//No because compound inequalities do not work
public class LogicalOperators1_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        boolean discount = (age < 10 || age > 65);
        System.out.println(discount);
    }
}
