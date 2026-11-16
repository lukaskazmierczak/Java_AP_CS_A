package assignments.ch7.section05;

import net.apcs.classes.Student;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class StudentSort_Main {

    private static Scanner console = new Scanner(System.in);

    private final static String[] firstNames = {"Joe","Tim","Sam","Oliva","Alex","Charlie","Elton","Lydia","Sara","Katie","Thomas","Katy","Beth","Sandra","Lily","Ralph","Ron","Rick"};
    private final static String[] lastNames = {"Smith","Jones","Johnson","Robertson","Whalen","Will","Hienz","Hanson","Gaiser","Lipke","Chudy","Stone","Post","Barnaby","Scobel","McCless","George","Labenz"};


    public static void main(String[] args) {
        Student students[] = getStudents(10);

        for (Student student : students) {
            System.out.println(student.getLastName() + ", " + student.getFirstName());
        }

        // Write your code to sort the student array here



        for (Student student : students) {
            System.out.println(student.getLastName() + ", " + student.getFirstName());
        }

    }

    public static Student[] getStudents(int numOfStudents) {
        Student[] a = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            String first = firstNames[(int)(Math.random() * firstNames.length)];
            String last = lastNames[(int)(Math.random() * lastNames.length)];
            Student student = new Student(first, last);
            student.setTest(1, (int)(Math.random()*50 + 50));
            student.setTest(2, (int)(Math.random()*50 + 50));
            student.setTest(3, (int)(Math.random()*50 + 50));
            a[i] = student;
        }

        return a;
    }
}
