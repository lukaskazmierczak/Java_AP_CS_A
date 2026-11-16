package assignments.ch6.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
        Do you prefer returning a new list or modifying an existing list?
 I prefer a new list because it is easier to remake a list than deal with the complicated values already within the list.

 */
public class NoTeens_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> a;

        a = new ArrayList<>(Arrays.asList( new Integer[]{12, 13, 19, 20} ));
        noTeen(a);
        System.out.println( a );

        a = new ArrayList<>(Arrays.asList( new Integer[]{1, 14, 1} ));
        noTeen(a);
        System.out.println( a );

        a = new ArrayList<>(Arrays.asList( new Integer[]{15} ));
        noTeen(a);
        System.out.println( a );

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a String (enter '-1' to terminate): ");
        int num = keyboard.nextInt();
        while( num != -1 ) {
            list.add(num);
            System.out.print("Enter a Integer (enter 'stop' to terminate): ");
            num = keyboard.nextInt();
        }
        System.out.println("list = " + list);
        noTeen(list);
        System.out.println("list = " + list);
    }

    private static void noTeen(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > 12 && a.get(i) < 20) {
                a.remove(a.get(i));
                i = 0;
            }
        }

    }
}
