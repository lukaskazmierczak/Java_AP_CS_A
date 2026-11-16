package assignments.ch8;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Selection is easier but I like insertion sort more
 */
public class InsertionSort_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String[] list = {"one", "two", "three", "four", "five"};
        for(int i = 0; i < list.length; i++) {
            String place = list[i];
            for(int j = i - 1; j >= 0 && place.compareTo(list[j]) < 0; j--){
                list[j + 1] = list[j];
                list[j] = place;
            }
        }
        for(String item: list){
            System.out.println(item);
        }
    }
}
