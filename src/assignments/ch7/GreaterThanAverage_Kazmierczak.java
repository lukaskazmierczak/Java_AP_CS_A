package assignments.ch7;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Yes, I would remove the method and not need the array to transfer the values from main to findAverage
 */
public class GreaterThanAverage_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many inputs would you like?");
        int input = keyboard.nextInt();
        double[] nums = new double[input];
        for(int i = 0; i < input; i++){
            System.out.println("Please enter a double: ");
            double num = keyboard.nextDouble();
            nums[i] = num;
        }
        double av = findAverage(nums);
        System.out.println("Average: " + av);
        System.out.println("Numbers above average: ");
        for(double num : nums){
            if(num > av){
                System.out.println(num);
            }
        }
    }
    private static double findAverage(double[] nums){
        double sum = 0;
        for(double num : nums){
            sum+= num;
        }
        return sum/nums.length;
    }
}
