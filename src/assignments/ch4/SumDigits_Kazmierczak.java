package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would put a loop within the loop to loop until the sum was less than 10.
 */
public class SumDigits_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a non-negative integer:");
        int num = keyboard.nextInt();
        System.out.println(sumDigits(num));
    }
    private static int sumDigits(int num){
        int counter = 1;
        int sum = 0;
        while(num > 0){
            if((num-counter)%10 == 0){
                num/=10;
                sum += counter;
                counter = 1;
            }
            else{
                counter++;
            }

        }
        return sum;
    }


}
