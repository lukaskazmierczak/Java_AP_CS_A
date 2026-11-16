package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
// This one was harder because we had to include the zeros. ex the hundreds was 100 not 1.
public class SeperateNumber_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a three digit number: ");
        int num = keyboard.nextInt();
        int hund = num - (num % 100);
        int ten = (num % 100) - (num%10);
        int one = num % 10;
        System.out.println(hund + " + " + ten + " + " + one);

    }
}
