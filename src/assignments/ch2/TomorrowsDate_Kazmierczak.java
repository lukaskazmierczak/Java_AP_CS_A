package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
divide days by months to separate.
 */
public class TomorrowsDate_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is the year?");
        int year = keyboard.nextInt();
        System.out.println("What is the month?");
        int month = keyboard.nextInt();
        System.out.println("What is the day?");
        int day = keyboard.nextInt();
        if (month == 12 && day == 31){
            year = year + 1;
            month = 1;
            day = 1;

        }
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30){
            day = 1;
            month = month + 1;
        }
        else if (month == 2 && day == 29 && year%400 != 0 && year%4 == 0){
            month = month + 1;
            day = 1;
        }
        else if (month == 2 && day == 28){
            day = 1;
            month = month + 1;
        }
        else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31){
            day = 1;
            month = month + 1;
        }
        else {
            day = day + 1;
        }
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}
