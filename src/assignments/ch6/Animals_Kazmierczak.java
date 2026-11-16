package assignments.ch6;

import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
we have to pass the count variable because the i value changes after each instance of the loop. In other words, the data used in previous loops cannot be used when another instance overrides it, so it must be stored in a variable.
 */
public class Animals_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String[] list = new String[100];
        int num = getAnimals(list);
        System.out.println("There are " + num + " animals in this list");
        System.out.println("All animals:");
        for(String item : list){
            System.out.println(item);
        }
        System.out.println("All input animals:");
        for(String item : list){
            if(item != null){
                System.out.println(item);
            }
        }
        System.out.println("Pick a letter: ");
        String letter = keyboard.nextLine();
        int first = findFirstOccurrenceOf(list, num, letter);
        System.out.println("The first animal that starts with the letter " + letter + " is animal number " + first);
        int occur = countOccurrenceOf(list, num, letter);
        System.out.println("There are " + occur + " animals that start with the letter " + letter);
    }
    private static int getAnimals(String[] animals){
        String word;
        int count = 0;
        do{
            System.out.println("Enter a word ('STOP' to end)");
            word = keyboard.nextLine();
            if(!(word.equals("STOP"))){
                animals[count] = word;
                count++;
            }
        }while(!(word.equals("STOP")));
        return count;
    }
    private static int findFirstOccurrenceOf(String[] animals, int count, String letter){
        int number = 0;
        for(int i = 0; i < count; i++){
            if(animals[i].substring(0, 1).equals(letter)){
                number = i;
                break;
            }
        }
        return number + 1;
    }
    private static int countOccurrenceOf(String[] animals, int count, String letter){
        int amount = 0;
        for(int i = 0; i < count; i++){
            if(animals[i].substring(0, 1).equals(letter)){
                amount++;

            }
        }
        return amount;
    }
}
