package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would make a loop that repeat 10 times, in that loop make anther that repeats ten times, remember the longest and shortest ones.
 */
public class Necklace_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number:");
        int start1 = keyboard.nextInt();
        System.out.println("Give a number:");
        int start2 = keyboard.nextInt();
        int num1 = start1;
        int num2 = start2;
        int hold = num2;
        int count = 0;
        System.out.println(num1);
        do{
            count += 1;
            System.out.println(num2);
            num2 = (num1 + num2)%10;
            num1 = hold;
            hold = num2;
        }while(num1 != start1 || num2 != start2);
        System.out.println(num2);
        System.out.println("Length: " + (count + 2));
    }
}
