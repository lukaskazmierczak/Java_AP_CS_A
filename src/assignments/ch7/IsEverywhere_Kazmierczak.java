package assignments.ch7;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class IsEverywhere_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many inputs would you like?");
        int input = keyboard.nextInt();
        System.out.println("What number would you like to check??");
        int numero = keyboard.nextInt();
        int[] nums = new int[input];
        for(int i = 0; i < input; i++){
            System.out.println("Please enter a number: ");
            int num = keyboard.nextInt();
            nums[i] = num;
        }
        boolean result = isEverywhere(nums, numero);
        System.out.println("Result: " + result);
    }
    private static boolean isEverywhere(int[] a, int num){
        boolean res = true;
        for(int i = 1; i < a.length-1; i++){
            if(a[0] != num && a[1] != num){
                res = false;
            }
            if(a[i] != num && a[i+1] != num && a[i-1] != num){
                res = false;
            }
            if(a[a.length-1] != num && a[a.length-2] != num){
                res = false;
            }
        }
        return res;
    }

}
