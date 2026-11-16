package assignments.ch5.section06;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class StaticStudent_Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(StaticStudent.randomStudent());
        }
    }
}
