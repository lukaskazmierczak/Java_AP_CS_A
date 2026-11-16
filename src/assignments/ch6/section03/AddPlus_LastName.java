package assignments.ch6.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
        What if the method had to modify the contents of the list instead of create an entirely new list?
        How would you have to change your code? I would have to set the values of a rather than add the values of a to copy.


 */
public class AddPlus_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> a;

        a = new ArrayList<>(Arrays.asList( new String[]{"a", "bb", "ccc"} ));
        System.out.println( addPlus(a) );

        a = new ArrayList<>(Arrays.asList( new String[]{"hello", "there"} ));
        System.out.println( addPlus(a) );

        a = new ArrayList<>(Arrays.asList( new String[]{"+"} ));
        System.out.println( addPlus(a) );

        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter a String (enter 'stop' to terminate): ");
        String line = keyboard.nextLine();
        while( ! line.equalsIgnoreCase("stop") ) {
            list.add(line);
            System.out.print("Enter a String (enter 'stop' to terminate): ");
            line = keyboard.nextLine();
        }
        System.out.println("list = " + list);
        System.out.println("addPlus(list) = " + addPlus(list));

    }

    private static ArrayList<String> addPlus(ArrayList<String> a) {
        ArrayList<String> copy = new ArrayList<>();
        for(int i = 0; i < a.toArray().length; i++){
            copy.add(a.get(i) + "+");
        }

        return copy;  // So it compiles
    }
}
