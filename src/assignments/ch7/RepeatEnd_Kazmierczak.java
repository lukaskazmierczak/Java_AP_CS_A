package assignments.ch7;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Very
 */
public class RepeatEnd_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a string:");
        String str = keyboard.nextLine();
        System.out.println("How many letters from the end would you like to repeat that many times?");
        int num = keyboard.nextInt();
        System.out.println(repeatEnd(str, num));
    }
    private static String repeatEnd(String str, int n){
        String s = str.substring(str.length()-n);
        String rep = "";
        for(int i = 0; i < n; i++){
            rep += s;
        }
        return rep;
    }

}
