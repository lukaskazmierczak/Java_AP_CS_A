package assignments.ch7.section03;

import net.apcs.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Square56_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> a, b;
        // Examples from problem description...
        a = (ArrayList<Integer>) Arrays.asList(3, 1, 4);
        System.out.println("a = " + a);
        b = square56(a);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println();

        a = (ArrayList<Integer>) Arrays.asList(1);
        System.out.println("a = " + a);
        b = square56(a);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println();

        a = (ArrayList<Integer>) Arrays.asList(2);
        System.out.println("a = " + a);
        b = square56(a);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println();

        // User Interactive Version...
        a = Input.getIntegerList();
        System.out.println("a = " + a);
        b = square56(a);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println();
    }

    private static ArrayList<Integer> square56(ArrayList<Integer> a) {
        return null;
    }
}
