package assignments.ch7;

import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class OrderedStrings_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String item;
        System.out.println("Enter a string (STOP to end): ");
        item = keyboard.nextLine();
        ArrayList<String> list = new ArrayList<>();
        list.add(item);
        do{
            System.out.println("Enter a string (STOP to end): ");
            item = keyboard.nextLine();
            for(int i = 0; i < list.size(); i++){
                if(list.get(0).compareTo(item) > 0){
                    list.add(0, item);
                    break;
                }
                else if(list.get(list.size()-1).compareTo(item) < 0){
                    list.add(item);
                    break;
                }
                else{
                    if(list.get(i).compareTo(item) < 0 && list.get(i + 1).compareTo(item) > 0){
                        list.add(i + 1, item);
                    }
                }

            }
            for(String x : list){
                System.out.println(x);
            }
        }while(item != "STOP");


    }
}
