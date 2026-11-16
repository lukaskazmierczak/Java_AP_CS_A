package assignments.ch7.section01;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
add variables 0 through 9 and increase them when x==that number
 */
public class More37_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        // Examples from problem description...
        System.out.println(more37(new int[]{3, 7, 3}));    // true
        System.out.println(more37(new int[]{3, 7, 3, 7})); // false
        System.out.println(more37(new int[]{3, 3}));       // true

        // User Interactive Version...
        int[] a = Input.getIntArray();
        System.out.println("more37(a) = " + more37(a));
    }

    private static boolean more37(int[] a) {
        int threes = 0;
        int sevens = 0;
        for(int x : a){
            if(x == 3){
                threes++;
            }
            if(x == 7){
                sevens++;
            }
        }
        if(threes > sevens){
            return true;
        }
        else{
            return false;
        }
    }
}
