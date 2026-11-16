package assignments.ch6.section03;

import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
        What if this needed to be done with Strings?
        What lines of code would you have to change in your program?
        How would you have to change them?
        I would have to use indexOf and subscript to find the first letter of each word and assign each letter to a number, then check which number was higher, then repeat with each letter until I determined which string was higher in the alphabet and place it in the correct position in the list.


 */
public class ListOfDoubles_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();
        System.out.println("Give a double");
        double num = keyboard.nextDouble();
        nums.add(num);
        do{
            System.out.println("Give a double (Type -999 to stop)");
            num = keyboard.nextDouble();

            for(int i = 0; i < nums.size(); i++){
                if(num > nums.get(i)){
                    nums.add(i,num);
                    break;
                }

            }
            for(int i = 0; i < nums.size(); i++){
                System.out.print(nums.get(i) + ", ");
            }
            System.out.println();
        }while(num != -999);

    }
}
