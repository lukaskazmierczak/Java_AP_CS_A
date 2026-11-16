package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I could add a decision method to return a price given an order number. This would allow changes to the menu easily and make the code look more organized.
 */
public class SimpleOrderSystem_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int act;
        int item;
        double total = 0;
        do{
            System.out.println("What would you like to do? \n1: add item to order \n2: checkout");
            act = keyboard.nextInt();
            if(act == 1){
                System.out.println("What would you like to order? \n1: Hard shell taco (3.25) \n 2: Soft shell taco (3.50) \n 3: Drink (2.00)");
                item = keyboard.nextInt();
                if(item == 1){
                    total += 3.25;
                }
                else if(item == 2){
                    total += 3.5;
                }
                if(item == 3){
                    total += 2;
                }
                else{
                    System.out.println("Try again!");
                }
            }
        }while(act == 1);
        System.out.println("Your total is: $" + total);
    }
}
