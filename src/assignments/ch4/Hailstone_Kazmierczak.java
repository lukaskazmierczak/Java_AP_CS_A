package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I like for loops because they are efficient and compact, I don't have to write much, but I get the same results as a while loop.
 */
public class Hailstone_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Starting Number?");
        int num = keyboard.nextInt();
        System.out.println("Show Numbers? (1 = True, 2 = False)");
        int value = keyboard.nextInt();
        boolean show = true;
        if(value == 1){
            show = true;
        }
        else if(value == 2){
            show = false;
        }
        System.out.println("Length: " + hailStone(num, show));
    }
    private static int hailStone(int num, boolean showNumbers){
        int count = 0;
        System.out.println("Input: " + num);
        do{
            count = count + 1;
            if(showNumbers == true){
                System.out.println(num);
            }
            if(num%2 == 1){
                num = (num * 3) + 1;
            }
            else if(num%2 == 0){
                num = num/2;
            }


        }while(num != 1);
        System.out.println("1");
        return count + 1;
    }
}
