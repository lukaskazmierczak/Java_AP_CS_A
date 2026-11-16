package assignments.ch6.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
        How do you feel about accessing elements with arrays versus lists?  (get/set vs. [])
good, I can do it well

 */
public class MoreZ_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> a;
        a = new ArrayList<>(Arrays.asList( new String[]{"a", "bb", "ccc"} ));
        moreZ(a);
        System.out.println( a );

        a = new ArrayList<>(Arrays.asList( new String[]{"hello", "there"} ));
        moreZ(a);
        System.out.println( a );

        a = new ArrayList<>(Arrays.asList( new String[]{"yay"} ));
        moreZ(a);
        System.out.println( a );

        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter a String (enter 'stop' to terminate): ");
        String line = keyboard.nextLine();
        while( ! line.equalsIgnoreCase("stop") ) {
            list.add(line);
            System.out.print("Enter a String (enter 'stop' to terminate): ");
            line = keyboard.nextLine();
        }
        System.out.println("list = " + list);
        moreZ(list);
        System.out.println("list = " + list);
    }

    private static void moreZ(ArrayList<String> a) {
        for(int i = 0; i < a.toArray().length; i++){
            a.set(i, "z" + a.get(i) + "z");
        }

    }
}
