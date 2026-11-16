package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//You can use modulus to find if a number is even or odd by using num%2.
//This will return 0 if the number is even or 1 if the number is odd.
public class Modulus_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int num = 123;
        int ones, tens, hundreds;
        hundreds = num/100;
        tens = (num/10)%10;
        ones = num%120;
        System.out.print(num + "\n" + hundreds + "\n" + tens + "\n" + ones);
    }
}
