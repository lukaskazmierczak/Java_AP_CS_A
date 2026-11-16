package assignments.ch7;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.substring;

/*  ANSWER QUESTION HERE
Taco Cat
 */
public class Palindrom2_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String pal = "";
        System.out.println("Give a word");
        String str = keyboard.nextLine();
        System.out.println("Is this a palindrome?");
        for(int i = 0; i < str.length();i++){
            for(int j = 0; j < letters.length(); j++){
                if(str.charAt(i) == letters.charAt(j)){
                    pal += str.charAt(i);
                }
            }
        }
        System.out.println(pal);
        int amount = 0;
        int count = 0;
        char cap ;
        char low;
        for(int i = pal.length()-1; i > 0; i--){
            if((upper.indexOf(pal.charAt(count))) != -1){
                low = pal.charAt(count);
                cap = upper.charAt(upper.indexOf(pal.charAt(count)));
            }
            else{
                cap = pal.charAt(count);
                low = lower.charAt(lower.indexOf(pal.charAt(count)));
            }
            if(low == (pal.charAt(i)) || cap == (pal.charAt(i))){
                amount++;
            }
            count++;
        }
        if(amount == pal.length()-1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
