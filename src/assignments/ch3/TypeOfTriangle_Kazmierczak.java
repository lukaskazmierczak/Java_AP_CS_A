package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
to separate parts of code into different functions which are put together in the main method.
 */
public class TypeOfTriangle_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This triangle is " + triType());
    }
    private static String triType(){
        System.out.println("Give a number:");
        int num1 = keyboard.nextInt();
        System.out.println("Give a number:");
        int num2 = keyboard.nextInt();
        System.out.println("Give a number:");
        int num3 = keyboard.nextInt();
        if (num1 == num2 && num2 == num3 && num1 == num3){
            return ("Equilateral");
        }
        else if (num1 != num2 && num2 != num3 && num1 != num3){
            return ("Scalene");
        }
        else {
            return ("Isosceles");
        }
    }
}
