package assignments.ch3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
only run beginNend if n <= word
 */
public class BeginNEnd_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a word");
        String word = keyboard.nextLine();
        System.out.println("Give a number");
        int num = keyboard.nextInt();
        System.out.println(beginNend(word, num));
    }
    private static String beginNend(String word, int num){
        String begin = word.substring(0, (num));
        System.out.println(begin);
        String end = word.substring(word.length()-(num));
        System.out.println(end);
        return begin + end;
    }
}
