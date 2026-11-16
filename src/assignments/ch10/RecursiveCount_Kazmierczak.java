package assignments.ch10;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
it would be harder to think of but easier to write, depends on how much they plan prior
 */
public class RecursiveCount_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {3, 12, 5, 1, 45, 76, 8, 9, 2, 9, 8, 7};
        int count = countBigger(a, 0, 10);
        System.out.println("Count Bigger than 10: " + count);
        count = countBigger(a, 0, 5);
        System.out.println("Count Bigger than 5: " + count);
    }
    public static int countBigger(int[] a, int loc, int num){
        int count = 0;
        if(loc < a.length){
            count += countBigger(a,loc+1, num);
            if(a[loc] > num){
                count++;
            }

        }

        return count;
    }

}
