package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I don't have to repeat lines of code.
 */
public class GCD_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a non-negative integer:");
        int num1 = keyboard.nextInt();
        System.out.println("Give a non-negative integer:");
        int num2 = keyboard.nextInt();
        System.out.println(findGCD(num1, num2));
    }
    private static int findGCD(int num1, int num2){
        while(num2 > 0){
            int temp = num1%num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }

}
