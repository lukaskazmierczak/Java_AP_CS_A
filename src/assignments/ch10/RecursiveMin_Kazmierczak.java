package assignments.ch10;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Yes, the fact that i am comparing the size of objects in the array
 */
public class RecursiveMin_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {3, 12, 5, 1, 45, 76, 8, 9, 2, 9, 8, 7};
        int min = findMin(a, 0);
        System.out.println("Min value is " + min);
    }
    public static int findMin(int[] a, int loc){
        int min = a[loc];
        if(loc < a.length-1) {
            int old = findMin(a, loc + 1);
            if (min > old){
                min = old;

            }
        }
        System.out.println(min);
        return min;
    }
}
