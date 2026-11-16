package assignments.ch7.section01;

import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class CenteredAverage_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        // Examples from problem description...
        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));       // 3
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));   // 5
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0})); // -3


        // User interactive version...
        int[] a = Input.getIntArray();
        System.out.println("centeredAverage(a) = " + centeredAverage(a));

    }

    private static int centeredAverage(int[] a) {
        int max = a[a.length-1];
        int min = a[0];
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }
        int sum = 0;
        for(int x : a){
            sum += x;
        }
        sum -= max;
        sum -= min;
        sum /= (a.length-2);
        return sum;
    }
}
