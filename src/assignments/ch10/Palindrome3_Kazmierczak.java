package assignments.ch10;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
iterative, recursion hurts my brain
 */
public class Palindrome3_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a string");
        String str = keyboard.nextLine();
        String back = palindrome(str);
        System.out.println(back);
        if(back.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static String palindrome(String s){
        if(s.length() == 1){
            return s;
        }
        else{
            String val = s.substring(s.length()-1);
            return val + palindrome(s.substring(0, s.length()-1));
        }
    }
}
