package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would create a new variable sum and add counter to sum for every factor.
 */
public class FunWithFactors1_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number:");
        int num = keyboard.nextInt();
        int counter = 1;
        while (counter <= num){
            if(num % counter == 0){
                System.out.println(counter);
                counter++;
            }
            else{
                counter++;
            }
        }
    }

}
