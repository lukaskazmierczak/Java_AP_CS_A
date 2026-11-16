package assignments.ch6;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
null, there is no input so there is essentially no value in that element.
 */
public class MaxEnd4_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array0 = {11, 5, 4, 9};
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 11, 7, 3};
        int[] num0 = maxEnd4(array0);
        for(int j = 0; j < num0.length; j++){
            System.out.println(num0[j]);
        }
        System.out.println();
        int[] num1 = maxEnd4(array1);
        for(int j = 0; j < num1.length; j++){
            System.out.println(num1[j]);
        }
        System.out.println();
        int[] num2 = maxEnd4(array2);
        for(int j = 0; j < num2.length; j++){
            System.out.println(num2[j]);
        }
    }
    private static int[] maxEnd4(int[] a) {
        int[] array = new int[4];
        int length = a.length - 1;
        if (a[0] > a[length]) {
            for (int i = 0; i <= length; i++) {
                array[i] = a[0];
            }
        } else {
            for (int i = 0; i <= length; i++) {
                array[i] = a[length];
            }
        }
        return array;
    }
}
