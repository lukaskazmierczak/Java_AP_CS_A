package assignments.ch5.section02;

import java.util.Scanner;

public class Student_Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Student_Mod student = new Student_Mod("Fred", "Flintstone");
        student.setTest(1, 70);
        student.setTest(2, 80);
        student.setTest(3, 90);
        student.setTest(4, 100);

        // Checking the Student functionality
        System.out.println("student.getLowestScore() = " + student.getLowestScore());                   // 70
        System.out.println("student.getAverageWithoutLowest() = " + student.getAverageWithoutLowest()); // 90
        System.out.println("student.getAverage() = " + student.getAverage());                           // 85
        System.out.println("student.getHighScore() = " + student.getHighScore());                       // 100

        // Testing the copyFrom functionality
        Student_Mod copier = new Student_Mod("Cheater", "PumpkinEater");
        copier.copyFrom(student);

        // The scores should be the same
        System.out.printf("%10s%10s%10s%n", "Test", "student", "copier");
        for (int i = 1; i < 5; i++) {
            System.out.printf("%10d%10f%10f%n", i, student.getTest(i), copier.getTest(i));
        }

        // Same scores.  Different names.
        System.out.println("student = " + student);
        System.out.println("copier = " + copier);
    }
}
