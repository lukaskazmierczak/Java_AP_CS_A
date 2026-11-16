package assignments.ch6.section03;

import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
        What would you do if I had you reverse the given list rather than create a new list and return it?
        I would take the first item and move it to the back of the list list.size() number of times.

 */
public class ReverseList_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String word;
        ArrayList<String> list = new ArrayList<>();
        do{
            System.out.println("Enter a word ('STOP' to end)");
            word = keyboard.nextLine();
            list.add(word);
        }while(!(word.equals("STOP")));
        list.remove(list.size()-1);
        System.out.println("Original:");
        for(String item : list){
            System.out.print(item + ", ");
        }
        System.out.println();
        System.out.println("Reverse List:");
        ArrayList<String> rev = reverseMe(list);
        for(String thing : rev){
            System.out.print(thing + ", ");
        }
    }

    private static ArrayList<String> reverseMe(ArrayList<String> list) {
        ArrayList<String> array = new ArrayList<>();
        for(int i = list.size()-1; i >= 0; i--){
            array.add(list.get(i));
        }
        return array; // So it compiles
    }
}
