package assignments.ch6.section03;

import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
        Explain why wrapper classes are necessary.


 */
public class Tripling_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        /*  Examples from problem description
        ArrayList<Integer> a;

        a = new ArrayList<>(Arrays.asList( new Integer[]{1, 2, 3} ));
        System.out.println( tripling(a) );

        a = new ArrayList<>(Arrays.asList( new Integer[]{6, 8, 6, 8, -1} ));
        System.out.println( tripling(a) );

        a = new ArrayList<>(Arrays.asList( new Integer[]{} ));
        System.out.println( tripling(a) );
        */

        /*  Interactive Version
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a String (enter '-1' to terminate): ");
        int num = keyboard.nextInt();
        while( num != -1 ) {
            list.add(num);
            System.out.print("Enter a Integer (enter 'stop' to terminate): ");
            num = keyboard.nextInt();
        }
        System.out.println("list = " + list);
        System.out.println("tripling(list) " + tripling(list));
        */

    }

    private static ArrayList<Integer> tripling(ArrayList<Integer> a) {




        return null; // So it compiles
    }
}
