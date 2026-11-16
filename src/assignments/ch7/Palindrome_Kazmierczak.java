package assignments.ch7;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Palindrome_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a word");
        String word = keyboard.nextLine();
        System.out.println("Is this a palindrome?");
        System.out.println(isPalindrome(word));
    }
    private static boolean isPalindrome(String str){
        int amount = 0;
        int count = 0;
        for(int i = str.length()-1; i > 0; i--){
            if(str.charAt(count)==(str.charAt(i))){
                amount++;
            }
            count++;
        }
        if(amount == str.length()-1){
            return true;
        }
        else{
            return false;
        }
    }
}
