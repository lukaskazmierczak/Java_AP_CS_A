package assignments.ch7;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
yes, it is called a two-dimensional list
 */
public class FiveFive_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many inputs would you like?");
        int input = keyboard.nextInt();
        int[] nums = new int[input];
        for(int i = 0; i < input; i++){
            System.out.println("Please enter a number: ");
            int num = keyboard.nextInt();
            nums[i] = num;
        }
        boolean result = fiveFive(nums);
        System.out.println("Result: " + result);
    }
    private static boolean fiveFive(int[] a){
        for(int i = 1; i < a.length-1; i++){
            if(a[i] == 5) {
                if (!(a[0] == 5 || a[1] == 5)) {
                    return false;
                }
                if (!(a[i + 1] == 5 || a[i - 1] == 5)) {
                    return false;
                }
                if (!(a[a.length-1] == 5 || a[a.length-2] == 5)) {
                    return false;
                }
            }
        }
        return true;
    }

}
