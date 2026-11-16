package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//I feel very confident
public class EggPricing_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many eggs?");
        int eggs = keyboard.nextInt();
        int dozen = eggs / 12;
        int left = eggs % 12;
        double price = 0;
        if (dozen > 0 && dozen < 4){
            price = (dozen * .5) + (left * .05);
        }
        else if (dozen >= 4 && dozen < 6){
            price = (dozen * .45) + (left * .045);
        }
        else if (dozen >= 6 && dozen < 11){
            price = (dozen * .40) + (left * .04);
        }
        else if (dozen >= 11){
            price = (dozen * .35) + (left * .035);
        }
        System.out.println("Price: " + price);
    }
}
