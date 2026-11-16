package assignments.ch10;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class AtoB_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a string: ");
        String str = keyboard.nextLine();
        String string = changeAtoB(str);
        System.out.println(string);
    }
    private static String changeAtoB(String str){
        String s = "";
        if(str.length() == 1){
            if(str.substring(0).equals("a")){
                s += "b";
            }
            else{
                s += str.substring(0);
            }
            return s;
        }
        if(str.substring(0, 1).equals("a")){
            s += "b";
        }
        else{
            s += str.substring(0, 1);
        }
        s += changeAtoB(str.substring(1));
        return s;
    }
}
