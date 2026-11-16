package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//Y2K scare was when the year changed from 1999 to 2000, many were worried that the change in year would be understood by the computers as 00, causing global havoc. This happened because people did not code their calandars to manage a change in centuries.
public class IsItLeapYear_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a year:");
        int year = keyboard.nextInt();
        if (year > 9999 || year < 1582){
            System.out.println("Not a valid year");
        }
        else if (year%4 == 0 && year%400 != 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
