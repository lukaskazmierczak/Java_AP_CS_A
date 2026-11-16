package assignments.ch10;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Count3_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give an integer");
        int num = keyboard.nextInt();
        int end = count3(num);
        System.out.println(end);
    }
    private static int count3(int num){
        int count = 0;
        if(num == 0){
            return count;
        }
        if(num%10 == 3){
            count++;
        }
        count += count3(num/10);
        return count;
    }
}
