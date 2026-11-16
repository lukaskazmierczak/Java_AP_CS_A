package assignments.ch6;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would have to use substring to find the different individual letters in the word.
 */
public class NumberCounter_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number:");
        long num = keyboard.nextInt();
        int[] count = new int[10];
        int[] n = {0, 1, 2, 3, 4, 5 ,6 ,7 ,8, 9};
        while(num != 0){
            for(int i = 0; i < 10; i++){
                if(num%10 == num){
                    count[(int)num]++;
                    num = 0;
                    break;
                }
                else if(num%100 == num){
                    count[(int)num/10]++;
                    num = num%10;
                }
                else if(num%(int)(num/10) == n[i]){
                    count[i]++;
                    num = (int)(num/10);
                }
            }
        }
        for(int ns : n){
            System.out.print(ns + ": ");
            System.out.println(count[ns]);
        }
    }
}
