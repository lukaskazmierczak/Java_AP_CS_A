package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would create a sum variable and add num/ten to it rather that printing num/ten, then return sum.
 */
public class DisplayDigits_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a non-negative integer:");
        int num = keyboard.nextInt();
        int counter = 1;
        while(num > 1){
            int ten = (int)Math.pow(10, (int)Math.log10(num));
                System.out.println(num/ten);
                num = num % ten;


            }


    }
}
