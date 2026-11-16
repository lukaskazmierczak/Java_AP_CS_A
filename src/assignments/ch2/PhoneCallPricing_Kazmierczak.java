package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//initial and additional costs
public class PhoneCallPricing_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many minutes are you calling?");
        double min = keyboard.nextInt();
        double cost;
        if (min <= 2){
            cost = 1.15;
        }
        else{
            cost = 1.15 + ((min-2) * .5);
        }
        System.out.println("You will pay $" + cost);
    }
}
