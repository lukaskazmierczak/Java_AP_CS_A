package assignments.ch7.section03;

import assignments.ch5.section06.StaticStudent;
import net.apcs.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
their size does not need to be defined prior to usage
 */
public class No8_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many inputs would you like?");
        int input = keyboard.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < input; i++){
            System.out.println("Please enter a number: ");
            int num = keyboard.nextInt();
            nums.add(num);
        }
        ArrayList<Integer> result = no8(nums);
        for(int res : result){
            System.out.println(res);
        }
    }

    private static ArrayList<Integer> no8(ArrayList<Integer> a) {
        int count = 1;
        boolean has8 = false;
        ArrayList<Integer> banana = new ArrayList<>();
        for(int x : a){
            int num = x;
            if(num == 8){
                has8 = true;
            }
            while(num/count != 0){
                if(num% Math.pow(10,count) == 8){
                    has8 = true;
                    break;
                }
                else{
                    count++;
                }
            }
            if(has8 == false){
                banana.add(x);

            }
            has8 = false;
            count = 1;
        }
        return banana;
    }
}
