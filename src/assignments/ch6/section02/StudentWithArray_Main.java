package assignments.ch6.section02;
/**
 * Created by jsmith on 2/13/2019.
 */

import net.apcs.classes.Student;

import java.util.Scanner;

public class StudentWithArray_Main {

    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        StudentWithArray student = new StudentWithArray("Fred", "Flintstone");
        student.setTest(99, 70);
        student.setTest(0, 80);
        student.setTest(50, 90);
        student.addTest(5,100);
        student.addTest(20,60);

        // Checking the Student functionality
        System.out.println("student.getAverage() = " + student.getAverage());                           // 80
        System.out.println("student.getHighScore() = " + student.getHighScore());                       // 100


    }
}
