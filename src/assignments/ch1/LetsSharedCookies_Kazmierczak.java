package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//yes, but it would be very difficult to find anything and everything would be confusing.
public class LetsSharedCookies_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfPeople;
        int numberOfCookies;
        int cookiesPerPerson;
        int leftOverCookies;
        double fractionCookies;
        System.out.print("How many cookies are there? ");
        numberOfCookies = keyboard.nextInt();
        System.out.print("How many people are there? ");
        numberOfPeople = keyboard.nextInt();
        cookiesPerPerson = numberOfCookies / numberOfPeople;
        leftOverCookies = numberOfCookies % numberOfPeople;
        fractionCookies = (double)leftOverCookies / numberOfPeople;
        System.out.println("Since there are " + numberOfPeople + " and we only have " + numberOfCookies + ", each person");
        System.out.println("will have to eat " + cookiesPerPerson + " and there will be " +  leftOverCookies + " left.");
        System.out.println("If you wanted to be fair, you would break up the left over pieces so that each person");
        System.out.println("gets " + fractionCookies + ".");

    }
}
