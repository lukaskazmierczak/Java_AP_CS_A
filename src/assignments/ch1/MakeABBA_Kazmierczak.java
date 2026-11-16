package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//A string datatype has quotation marks around it.
public class MakeABBA_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a string:");
        String a = keyboard.nextLine();
        System.out.println("Give a string:");
        String b = keyboard.nextLine();
        System.out.println(a+b+b+a);
    }
}
