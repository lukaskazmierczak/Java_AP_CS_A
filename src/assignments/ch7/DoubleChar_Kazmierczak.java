package assignments.ch7;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would create another loop in double char that would repeat num times at adding str.charAt(i)
 */
public class DoubleChar_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a string:");
        String str = keyboard.nextLine();
        System.out.println(doubleChar(str));
    }
    public static String doubleChar(String str){
        String s = "";
        for(int i = 0; i < str.length(); i++){
            s += str.charAt(i);
            s += str.charAt(i);
        }
        return s;
    }

}
