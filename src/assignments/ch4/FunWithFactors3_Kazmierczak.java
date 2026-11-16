package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
THIS ONE I HATED IT
 */
public class FunWithFactors3_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number:");
        int num = keyboard.nextInt();
        int sum = 0;
        int perfectSum = 0;
        int perfect = 0;
        int prime = 0;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j < i; j++) {
                if(i % j == 0) {
                    sum += i;
                    perfectSum += j;
                    System.out.println(i + " " + j + " " + perfectSum);
                }
            }
            if(i == sum){
                prime = i;
            }
            if(perfectSum == i){
                perfect = i;
            }
            sum = 0;
            perfectSum = 0;
        }
        System.out.println("The largest prime number between 1 and your number is " + prime);
        System.out.println("The largest perfect number between 1 and your number is " + perfect);


    }
}
