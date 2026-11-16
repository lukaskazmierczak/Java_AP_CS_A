package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Yes, but they would all need to be formatted the same way. Sometimes they have +1 at the beginning or something similar.
 */
public class FormatSSN_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give SSN");
        String num = keyboard.nextLine();
        System.out.println(removeDashes(num));
    }
    private static String removeDashes(String ssn){
        String a = ssn.substring(0, 3);
        String b = ssn.substring(4, 6);
        String c = ssn.substring(7);
        return a + b + c;
    }
}
