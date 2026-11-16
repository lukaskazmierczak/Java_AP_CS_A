package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class minCat_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a word:");
        String a = keyboard.nextLine();
        System.out.println("Give a word:");
        String b = keyboard.nextLine();
        System.out.println(minCat(a,b));
    }
    public static String minCat(String a, String b){
        if (a.length() > b.length()){
            a = a.substring(b.length() + 1);
        }
        if (a.length() < b.length()){
            b = b.substring(a.length() + 1);
        }
        return a+b;
    }
}
