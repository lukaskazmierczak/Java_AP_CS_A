package assignments.ch7.section03;

import net.apcs.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
The size of arrays does not need to be defined prior to usage.
 */
public class NoPositive_LastName {

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
        ArrayList<Integer> result = noPositive(nums);
        for(int res : result){
            System.out.println(res);
        }
    }

    private static ArrayList<Integer> noPositive(ArrayList<Integer> a) {
        ArrayList<Integer> in = new ArrayList<>();
        for(int x : a){
            if(x <= 0){
                in.add(x);
            }
        }
        return in;
    }
}
