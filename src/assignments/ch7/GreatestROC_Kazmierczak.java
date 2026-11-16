package assignments.ch7;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would make a loop to check all values rather than one by one
 */
public class GreatestROC_Kazmierczak {

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
        int result = maxRateOfChange(nums);
        System.out.println("Result: " + result);
    }
    private static int maxRateOfChange(int[] nums){
        int max = -1;
        for(int i = 0; i < nums.length-1; i++){
            if(Math.abs(nums[i] - nums[i+1]) > max){
                max = Math.abs(nums[i] - nums[i+1]);
            }
        }
        return max;
    }

}
