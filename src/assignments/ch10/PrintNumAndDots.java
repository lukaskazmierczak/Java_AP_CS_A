package assignments.ch10;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
yes,it is simplier, less methods
 */
public class PrintNumAndDots {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number");
        int n = keyboard.nextInt();
        printNumDots(n);
    }
    private static void printNumDots(int num){
        if(num > 0) {
            printNumDots(num - 1);
            System.out.print(num);
            dots(num);

        }
    }
    private static void dots(int num){
        if(num > 0){
            dots(num-1);
            System.out.print(".");
        }
    }
}
