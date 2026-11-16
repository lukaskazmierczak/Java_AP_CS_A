package assignments.ch7;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would just set check to be countMe
 */
public class CountHigh_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a sentence");
        String str = keyboard.nextLine();
        System.out.println("Numeber of \"hi\"s:");
        System.out.println(countHi(str));
    }
    public static int countHi(String str){
        int count = 0;
        String check = "hi";
        int loc = str.indexOf(check);
        while(loc != -1){
            str = str.substring(0,loc) + str.substring(loc + check.length());
            loc = str.indexOf(check);
            count++;
        }
        return count;
    }

}
