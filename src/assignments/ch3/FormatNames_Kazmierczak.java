package assignments.ch3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
The space seperating the first and middle name would be removed making: middle last, first. I could include a notice in the prompt saying no middle name.
 */
public class FormatNames_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give your full name: (First Last)");
        String name = keyboard.nextLine();
        String first = name.substring(0, name.indexOf(" "));
        String last = name.substring((name.indexOf(" ") + 1));
        System.out.println(last + ", " + first);
    }
}
