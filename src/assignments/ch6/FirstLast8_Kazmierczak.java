package assignments.ch6;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
items can be grouped together to perform the same action to all of them rather than perform the same action repeatedly to each individual object.
 */
public class FirstLast8_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array0 = {};
        int[] array1 = {8, 2, 3, 4, 5};
        int[] array2 = {1, 2, 8};
        int[] array3 = {1, 2, 3, 4, 5};
        System.out.println(eight(array0));
        System.out.println(eight(array1));
        System.out.println(eight(array2));
        System.out.println(eight(array3));
    }
    private static boolean eight(int[] a){
        int length = a.length-1;
        if(length > 0) {
            if (a[0] == 8 || a[length] == 8) {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
