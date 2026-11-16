package assignments.ch6;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
string.length is a method while array.length is a field
 */
public class DifferentFirstLast_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array0 = {};
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 1};
        System.out.println(different(array0));
        System.out.println(different(array1));
        System.out.println(different(array2));
    }
    private static boolean different(int[] a){
        int length = a.length-1;
        if(length > 0) {
            if (a[0] == a[length]) {
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}
