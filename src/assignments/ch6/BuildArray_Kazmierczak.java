package assignments.ch6;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
It is easier for computers to understand because they start at 0
 */
public class BuildArray_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Start?");
        int start = keyboard.nextInt();
        System.out.println("End?");
        int end = keyboard.nextInt();
        int[] nums = buildArray(start, end);
        for(int j = 0; j < end-start; j++){
            System.out.println(nums[j]);
        }
    }
    private static int[] buildArray(int start, int stop){
        int[] array = new int[stop-start];
        int count = 0;
        for(int i = 0; i < stop-start; i++){
            array[i] = start + i;
        }
        return array;
    }
}
