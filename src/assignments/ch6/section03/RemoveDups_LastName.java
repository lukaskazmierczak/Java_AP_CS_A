package assignments.ch6.section03;

import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
        Did you try this List? Because you should.
        {"dog","cat","cat","cat","cat","cat","cat","cat","dog","cat","dog","cat","dog","dog","dog","dog","dog","dog","dog","dog","dog","dog","dog","dog","dog","dog","cat"}
        Because you should.
 */
public class RemoveDups_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String word;
        ArrayList<String> list = new ArrayList<>();
        do{
            System.out.println("Enter a word ('STOP' to end)");
            word = keyboard.nextLine();
            list.add(word);
        }while(!(word.equals("STOP")));
        System.out.println("Original:");
        for(String item : list){
            System.out.print(item + ", ");
        }
        System.out.println();
        removeDuplicates(list);
        System.out.println("Remove Duplicates:");
        for(String item : list){
            System.out.print(item + ", ");
        }
    }

    private static void removeDuplicates(ArrayList<String> lists) {
        for(int i = 0; i < lists.size(); i++){
            for(int j = 0; j < lists.size(); j++){
                if(i != j && lists.get(i).equals(lists.get(j))){
                    lists.remove(j);
                    i = 0;
                }
            }
        }
        lists.remove(lists.size()-1);
    }
}
