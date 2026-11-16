package assignments.ch7.section02;

import net.apcs.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Remove44_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples form problem description...
        ArrayList<Integer> a;

        a = new ArrayList<Integer>(Arrays.asList(1, 4, 4));
        remove44(a);
        System.out.println(a); // [1]

        a = new ArrayList<Integer>(Arrays.asList(1, 4, 1, 4));
        remove44(a);
        System.out.println(a);  //[1, 4, 1, 4]

        a = new ArrayList<Integer>(Arrays.asList(4, 1, 4));
        remove44(a);
        System.out.println(a);  //[4, 1, 4]

        a = new ArrayList<Integer>(Arrays.asList(4, 4, 4, 5, 4, 4, 6));
        remove44(a);
        System.out.println(a);  //[4, 5, 6]


        // User interactive version...
        a = Input.getIntegerList();
        remove44(a);
        System.out.println("a = " + a);

    }

    private static void remove44(ArrayList<Integer> a) {

    }
}
