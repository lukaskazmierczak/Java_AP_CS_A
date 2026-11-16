package assignments.ch7.section03;

import net.apcs.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class NoQ_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> a, b;
        // Examples from problem description...
        a = (ArrayList<String>) Arrays.asList("aaa", "bbb", "aqa");
        System.out.println("a = " + a);
        noQ(a);
        System.out.println("a = " + a);
        System.out.println();

        a = (ArrayList<String>) Arrays.asList("hqiq", "hqello", "hi");
        System.out.println("a = " + a);
        noQ(a);
        System.out.println("a = " + a);
        System.out.println();

        a = (ArrayList<String>) Arrays.asList("hello", "howq", "are", "youq");
        System.out.println("a = " + a);
        noQ(a);
        System.out.println("a = " + a);
        System.out.println();

        // User Interactive Version...
        a = Input.getStringList();
        System.out.println("a = " + a);
        noQ(a);
        //System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println();
    }

    private static void noQ(ArrayList<String> a) {


    }
}
