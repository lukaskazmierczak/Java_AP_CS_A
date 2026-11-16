package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//No, you cannot print a negative amount of copies. There would be a negative price.
public class Printing_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many copies?");
        int copies = keyboard.nextInt();
        double price = 0;
        if (copies < 100){
            price = copies * .3;
        }
        else if (copies < 500){
            price = copies * .28;
        }
        else if (copies < 750){
            price = copies * .27;
        }
        else if (copies <= 1000){
            price = copies * .26;
        }
        else if (copies > 1000){
            price = copies * .25;
        }
        System.out.println("Cost per copy: " + (price/copies));
        System.out.println("Total: " + price);
    }
}
