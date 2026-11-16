package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
// They are written differently but they will react the same to any value
public class ComputingSalaries_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your salary?");
        double salary = keyboard.nextDouble();
        double nuevo;
        System.out.println("What is your performance rating?");
        int perf = keyboard.nextInt();
        if (perf == 1){
            nuevo = salary * 1.015;
        }
        if(perf == 2){
            nuevo = salary * 1.04;
        }
        else{
            nuevo = salary * 1.06;
        }
        System.out.println("Your new salary is $" + nuevo);
    }
}
