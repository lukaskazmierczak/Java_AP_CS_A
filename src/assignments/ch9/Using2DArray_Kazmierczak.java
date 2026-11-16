package assignments.ch9;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
A 2D array and a 1D array both store lists of information, but a 2D stores a list of lists items, while a 1D stores a list of items.
 */
public class Using2DArray_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] newArray = {
                {"a","b","c","d","e","f"},
                {"g","h","i","j","k","l"},
                {"m","n","o","p","q","r"},
                {"s","t","u","v","w","x"}
        };
        System.out.print(newArray[0][3]);
        System.out.print(newArray[2][2]);
        System.out.print(newArray[1][0]);
        System.out.println();

        System.out.print(newArray[0][2]);
        System.out.print(newArray[0][0]);
        System.out.print(newArray[3][1]);
        System.out.println();

        System.out.print(newArray[2][3]);
        System.out.print(newArray[1][2]);
        System.out.print(newArray[1][0]);
        System.out.println();

        System.out.print(newArray[2][5]);
        System.out.print(newArray[0][0]);
        System.out.print(newArray[0][1]);
        System.out.print(newArray[0][1]);
        System.out.print(newArray[1][2]);
        System.out.print(newArray[3][1]);

    }
}
