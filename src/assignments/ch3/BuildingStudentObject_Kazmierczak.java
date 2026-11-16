package assignments.ch3;

import net.apcs.classes.Student;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
First, last, test1, 2, 3, average, and highscore so 7
 */
public class BuildingStudentObject_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("What is the student's first name?");
        String first = keyboard.nextLine();
        System.out.println("What is the student's last name?");
        String last = keyboard.nextLine();
        System.out.println("What is the student's first test score?");
        double a = keyboard.nextDouble();
        System.out.println("What is the student's second test score?");
        double b = keyboard.nextDouble();
        System.out.println("What is the student's third test score?");
        double c = keyboard.nextDouble();
        student.setFirstName(first);
        student.setLastName(last);
        student.setTest(1, a);
        student.setTest(2, b);
        student.setTest(3, c);
        System.out.println(first + " " + last + "'s average test score is " + student.getAverage());
        System.out.println(first + " " + last + "'s highest test score is " + student.getHighScore());
    }
}
