package assignments.ch7.section03;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would find the amount of values of every number and find the largest ones
 */
public class MedianMode_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(findMode(nums));
        System.out.println(findMedian(nums));
        int[] nums1 = {1,2,2,2,4,5};
        System.out.println(findMode(nums1));
        System.out.println(findMedian(nums1));
    }
    private static int findMedian(int[] nums){
        if(nums.length%2==0){
            int sum = nums[nums.length/2 -1] + nums[nums.length/2];

            return sum/2;
        }
        else{
            return nums[(nums.length/2)];
        }
    }
    private static int findMode(int[] nums){
        int highest = -1;
        int nom = -1;
        for(int i = 0; i < nums.length-1; i++){
            int count = 0;
            for(int num: nums){
                if(num == nums[i]){
                    count++;
                }
            }
            if(count > highest){
                highest = count;
                nom = nums[i];
            }
        }
        return nom;
    }

}
