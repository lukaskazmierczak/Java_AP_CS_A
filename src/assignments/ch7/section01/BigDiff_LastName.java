package assignments.ch7.section01;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
All objects after the removed one are moved one index less than before
 */
public class BigDiff_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        // Examples from problem description...
        System.out.println(bigDiff(new int[] {10, 3, 5, 6})); // 7
        System.out.println(bigDiff(new int[] {7, 2, 10, 9})); // 8
        System.out.println(bigDiff(new int[] {2, 10, 7, 2})); // 8

        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("bigDiff(a) = " + bigDiff(a));

    }

    private static int bigDiff(int[] a) {
        int max = a[0];
        int min = a[0];
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }
        return max-min;
    }
}
