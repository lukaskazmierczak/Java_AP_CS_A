package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//I dont know I havent reached that far in the curicullum yet.
public class NumUnique_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 3;
        System.out.println("Give an integer:");
        int num1 = keyboard.nextInt();
        System.out.println("Give an integer:");
        int num2 = keyboard.nextInt();
        System.out.println("Give an integer:");
        int num3 = keyboard.nextInt();
        if (num1 == num2){
            num -= 1;
        }
        if (num3 == num2){
            num -= 1;
        }
        else if (num3 == num1){
            num -= 1;
        }
        System.out.println(num);
    }
}
