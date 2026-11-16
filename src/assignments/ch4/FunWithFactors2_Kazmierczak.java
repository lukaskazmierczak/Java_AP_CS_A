package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I prefer while loops, they seeem to fit the basic work we are doing now. For loops use too much of my brainpower.
 */
public class FunWithFactors2_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number:");
        int num = keyboard.nextInt();
        System.out.println(sumFactorsOf(num));
        int counter = 1;
        int sum = 0;
        while (counter < num){
            if(num % counter == 0){
                sum += counter;
                counter++;
            }
            else{
                counter++;
            }
        }
        if(sum == num){
            System.out.println("The number is perfect.");
        }
        if(sum == 1){
            System.out.println("The number is prime.");
        }


    }
    private static int sumFactorsOf(int n){
        int counter = 1;
        int sum = 0;
        while (counter <= n){
            if(n % counter == 0){
                System.out.println(counter);
                sum += counter;
                counter++;
            }
            else{
                counter++;
            }
        }
        System.out.println("=");
        return sum;
    }
}
