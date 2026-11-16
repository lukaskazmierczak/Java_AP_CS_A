package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//You are a math teacher and you like numbers
public class SuffixNumbersForText_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give an integer 0-100:");
        int num = keyboard.nextInt();
        String suf;
        if (num == 1){
            suf = "st";
        }
        else if (num == 2){
            suf = "nd";
        }
        else if (num == 3){
            suf = "rd";
        }
        else {
            suf = "th";
        }
        System.out.println(num + suf);
    }
}
