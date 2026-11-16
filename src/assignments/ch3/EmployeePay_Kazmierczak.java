package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
If I did this wrong, I would most definitely get fired not only because messing this up would either hurt the company or the employees, but this program is not difficult for someone who would be hired to code.
 */
public class EmployeePay_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("First Name?");
        String first = keyboard.nextLine();
        System.out.println("Last Name?");
        String last = keyboard.nextLine();
        System.out.println("Shift Code?");
        int shift = keyboard.nextInt();
        System.out.println("Hours Worked?");
        double hour = keyboard.nextDouble();
        System.out.println("Rate of Pay?");
        double rate = keyboard.nextDouble();
        if (shift == 2) {
            rate = rate + .10;
        }
        else if (shift == 3) {
            rate = rate + .25;
        }

        System.out.println("Employee Info:");
        System.out.println("Name: " + last + ", " + first);
        System.out.println("Shift Code: " + shift);
        System.out.println("Hours Worked: " + hour);
        System.out.println("Rate of Pay: " + rate);
        System.out.println("Gross Pay: " + CalcPay(shift, hour, rate));
    }
    private static double CalcPay(int shiftCode, double hoursWorked, double rateOfPay){

        double gross = 0;
        if (hoursWorked - 40 <= 0){
            gross = hoursWorked * rateOfPay;
        }
        else{
            gross = ((hoursWorked - 40) * 1.5 * rateOfPay) + (40 * rateOfPay);
        }
        return gross;
    }
}
