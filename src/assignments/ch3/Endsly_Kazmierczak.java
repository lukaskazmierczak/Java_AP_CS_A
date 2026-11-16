package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would have to make a seperate variable that would store the ending. Then I would check how many characters there are and create a substring of that many at the end of the word.
 */
public class Endsly_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a word");
        String str = keyboard.nextLine();
        System.out.println(endsLy(str));
        System.out.println(str.substring(str.length()-2));
    }
    private static boolean endsLy(String str){
        Boolean result = true;
        if(str.length() < 2){
            result = false;
        }
        else{
            if(!(str.substring(str.length()-2).equals("ly"))){
                result = false;
            }
            else{
                result = true;
            }
        }
        return result;
    }
}
