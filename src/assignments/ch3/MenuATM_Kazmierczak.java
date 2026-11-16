
package assignments.ch3;
import java.util.Scanner;
/*  ANSWER QUESTION HERE
The print menu can be used on anything rather than having to reprint different things in the same way
*/
public class MenuATM_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        printMenu();
    }
    public static void printMenu(){
        System.out.println("Welcome to the ATM. Please Select from one of the following options:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. Balance Inquiry");
        System.out.println("5. Exit");
    }
}
