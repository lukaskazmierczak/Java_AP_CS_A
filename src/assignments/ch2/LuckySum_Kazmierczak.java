package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//no, an if-else statement is true or false
public class LuckySum_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number");
        int a = keyboard.nextInt();
        System.out.println("Give a number");
        int b = keyboard.nextInt();
        System.out.println("Give a number");
        int c = keyboard.nextInt();
        int total;
        if (a == 13){
            total = 0;
        }
        else if (b == 13){
            total = a;
        }
        else if (c == 13){
            total = a + b;
        }
        else{
            total = a + b + c;
        }
        System.out.println(total);
    }
}
