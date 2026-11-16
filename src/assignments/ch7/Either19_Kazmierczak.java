package assignments.ch7;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
You are taking the object infront of the current one, if it is the last item in the list, there is nothing to take, hence the error.
 */
public class Either19_Kazmierczak {

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
        boolean result = either19(nums);
        System.out.println("Result: " + result);
    }
    private static boolean either19(int[] a){
        boolean one = false;
        boolean nine = false;
        for(int i = 0; i < a.length-1; i++){
            if(a[i] == 1 && a[i+1] == 1){
                one = true;
            }
            if(a[i] == 9 && a[i+1] == 9){
                nine = true;
            }
        }
        if(nine == true && one == true){
            return false;
        }
        else if(nine == true || one == true){
            return true;
        }
        else{
            return false;
        }
    }
}
