package assignments.ch6;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
no, if there are 5 items in a list and it is shrunk to a list of 3 items, what happens to the two items?
 */
public class MakeFirst_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = {7, 2, 3, 4, 5};
        int[] array2 = {1, 2, 1};
        int[] num1 = make(array1);
        for(int j = 0; j < num1.length; j++){
            System.out.println(num1[j]);
        }
        System.out.println();
        int[] num2 = make(array2);
        for(int j = 0; j < num2.length; j++){
            System.out.println(num2[j]);
        }
    }
    private static int[] make(int[] a){
        int length = a.length*2;
        int[] array = new int[length];
        array[0] = a[0];
        for(int i = 1; i < length; i++){
            array[i] = 0;
        }
        return array;
    }
}
