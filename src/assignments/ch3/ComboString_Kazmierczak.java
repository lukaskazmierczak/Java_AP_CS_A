package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
it woud print
 */
public class ComboString_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a string");
        String s1 = keyboard.nextLine();
        System.out.println("Give a string");
        String s2 = keyboard.nextLine();
        System.out.println(comboString(s1, s2));
    }
    private static String comboString(String a, String b){
        if(a.length() > b.length()){
            return (b + a + b);
        }
        else{
            return (a + b + a);
        }
    }
}
