package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I think everyone did similar solutions but there may be some variation because some people may not understand so they complete it in a more difficult way
 */
public class IsTriangle_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a length:");
        int a = keyboard.nextInt();
        System.out.println("Give a length:");
        int b = keyboard.nextInt();
        System.out.println("Give a length:");
        int c = keyboard.nextInt();
        System.out.println(IsTriangle(a, b, c));
    }
    private static boolean IsTriangle(int a, int b, int c){
        if (a > b + c || b > a + c || c > a + b){
            return false;
        }
        else {
            return true;
        }
    }
}
