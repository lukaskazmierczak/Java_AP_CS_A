package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
There are many uses of prime numbers in real life. One is the use of prime numbers for encryption on computers, computers can easily multiply large numbers to even larger ones, but dividing the many possiblilities is very difficult to do. Another way Prime numbers are used in the world is the life-cycle of cicadas. their life cycles of 13 and 17 years confuse predators and ensure survival because they are so different from the life cycles of other animals.
 */
public class PrimeFactorization_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give an integer: ");
        int num = keyboard.nextInt();
        System.out.println("Prime Factors:");
        int counter = 1;
        int sum = 0;
        int old = 0;
        for(int j = 1; j <= num; j++){
            if(num%j == 0){
                for(int i = 1; i <= j; i++){
                    if(j%i == 0){
                        sum += i;
                    }
                }
                if(sum == (1 + j)){
                    if(j == old){
                        counter++;
                    }
                    else{
                        if(old != 0){
                            System.out.print(old + "^" + counter + " * ");
                        }
                        counter = 1;
                    }

                    num = num/j;
                    old = j;
                    j = 1;

                }
                sum = 0;

            }
        }
        System.out.print(old + "^" + counter);
    }
}
