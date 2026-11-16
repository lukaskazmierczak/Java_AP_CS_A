package assignments.ch10;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class AddDigits_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number: ");
        int num = keyboard.nextInt();
        int sum = sumDigits(num);
        System.out.println(sum);
    }
    private static int sumDigits(int num){
        int sum = 0;
        sum += num%10;
        if(num == 0){
            return sum;
        }
        sum += sumDigits(num/10);
        return sum;
    }
}
