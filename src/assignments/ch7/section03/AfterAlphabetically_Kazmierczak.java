package assignments.ch7.section03;

import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
What would it measure?
 */
public class AfterAlphabetically_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("goat");
        list.add("zebra");
        list.add("animals");

        System.out.println("What word would you like?");
        String key = keyboard.nextLine();

        ArrayList<String> result = getWordsAfter(key, list);
        for(String res : result){
            System.out.println(res);
        }
    }
    private static ArrayList<String> getWordsAfter(String word, ArrayList<String> words){
        ArrayList<String> str = new ArrayList<>();
        for(String wo : words){
            if(wo.compareToIgnoreCase(word) > 0){
                str.add(wo);
            }
        }
        return str;
    }
}
