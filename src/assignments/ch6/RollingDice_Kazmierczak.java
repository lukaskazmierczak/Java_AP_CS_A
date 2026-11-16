package assignments.ch6;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I already did it
 */
public class RollingDice_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many dice would you like to roll?");
        int num = keyboard.nextInt();
        System.out.println("How many times?");
        int times = keyboard.nextInt();
        int[] array = new int[num * 6 + 1];
        for(int j = 0; j < times; j++){
            int v = rollDice(num);
            array[v] += 1;
        }
        for(int k = 0; k < num * 6 + 1; k++){
            System.out.println(k + ": " +array[k]);

        }




    }
    private static int rollDice(int numOfDice){
        int sum = 0;
        for(int i = 0; i < numOfDice; i++){
            sum += (int)(Math.random()*6+1);
        }
        return sum;
    }
}
