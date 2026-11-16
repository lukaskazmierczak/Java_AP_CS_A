package assignments.ch6.section03;

import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
        Why are lists better suited to this task than arrays?
        Because I dont need to limit the user input because the array can only be a certain size.

 */
public class OddListAndEvenList_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = getNumbers();
        System.out.println("Negative Numbers:");
        printList(getNegativeList(list));
        System.out.println("Even Numbers:");
        printList(getEvenList(list));
        System.out.println("Odd Numbers:");
        printList(getOddList(list));
    }

    private static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int num;
        do{
            System.out.println("Give an integer (-999 to stop)");
            num = keyboard.nextInt();
            numbers.add(num);
        }while(num != -999);
        return numbers; // So it compiles
    }

    private static ArrayList<Integer> getEvenList(ArrayList<Integer> nums) {
        ArrayList<Integer> even = new ArrayList<>();
        for(int num : nums){
            if(num%2==0){
                even.add(num);
            }
        }
        return even; // So it compiles
    }

    private static ArrayList<Integer> getOddList(ArrayList<Integer> nums) {
        ArrayList<Integer> odd = new ArrayList<>();
        for(int num : nums){
            if(num%2!=0){
                odd.add(num);
            }
        }
        return odd;
    }

    private static ArrayList<Integer> getNegativeList(ArrayList<Integer> nums) {
        ArrayList<Integer> neg = new ArrayList<>();
        for(int num : nums){
            if(num < 0){
                neg.add(num);
            }
        }
        return neg;
    }
    private static void printList(ArrayList<Integer> lists){
        for(int list : lists){
            if(list != -999){
                System.out.print(list + ", ");
            }
        }
        System.out.println();
    }

}
