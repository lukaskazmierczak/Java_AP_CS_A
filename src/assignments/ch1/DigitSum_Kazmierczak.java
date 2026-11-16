package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//when you divide an integer by 100, the decimal is moved two to the left and the decimals are extrapolated
public class DigitSum_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a three digit integer");
        int num = keyboard.nextInt();
        int hundreds = num/100;
        int tens = (num/10)%10;
        int ones = num%10;
        int sum = hundreds + ones + tens;
        System.out.println("Sum: " + sum);
    }
}
