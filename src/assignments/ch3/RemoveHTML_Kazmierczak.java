package assignments.ch3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class RemoveHTML_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Say something (preferably in HTML brackets)");
        String html = keyboard.nextLine();
        int mini = html.indexOf("<");
        int big = html.indexOf(">");

        if(mini == -1 || big == -1){
            System.out.println(html);
        }
        else{
            big = big + 1;
            String half = html.substring(big);
            System.out.println(half);
            int mini2 = half.indexOf("<");
            int big2 = half.indexOf(">");
            if(mini2 == -1 || big2 == -1){
                System.out.println(html);
            }
            else{
                System.out.println(big);
                System.out.println(mini2 + half.length());
                String half2 = html.substring(mini2, big2);
                System.out.println(html.substring(big, mini2 + half.length()));
            }

        }

    }
}
