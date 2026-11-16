package assignments.ch7.section04;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class CanBalance_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Examples from problem description...
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));  // true
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));  // false
        System.out.println(canBalance(new int[]{10, 10}));         // true

        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("canBalance(a) = " + canBalance(a));
    }

    private static boolean canBalance(int[] a) {
        for(int i = 0; i < a.length-1; i++){
            for(int j = 0; j < a.length-1; j++){

            }
        }
        return true;
    }
}
