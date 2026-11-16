package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Cryptography is the study of decoding (or hacking). Prime numbers are particularly useful for cryptography of the RSA algorithm, which relies on multiplying two large prime numbers to make decoding difficult. Prime numbers are very easy to multiply together, but seperating a massive number into its two prime numbers is very difficult for a computer. This is something called a one-way function, something that seems easy to perform for a computer on way, but could take thousands of year to compute back.
 */
public class PrimeFactors_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number");
        double num = keyboard.nextDouble();
        int counter = 2;
        while(counter <= num){
            if(num%counter == 0){
                System.out.print(counter + " ");
                num = num/counter;
            }
            else{
                counter++;
            }
        }
    }
}
