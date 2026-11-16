package assignments.ch3;

import net.apcs.classes.Student;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
very good
 */
public class WhoIsBetter_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Student a = getStudent();
        Student b = getStudent();
        Student better  = betterStudent(a, b);
        System.out.println(better.getFirstName() + " " + better.getLastName());
    }
    private static Student betterStudent(Student s1, Student s2){
        if(s1.getAverage() > s2.getAverage()){
            return s1;
        }
        else{
            return s2;
        }
    }
    private static Student getStudent(){
        System.out.println("New Student: \n");
        Student student = new Student();
        System.out.println("What is the student's first name?");
        String blah = keyboard.nextLine();
        String first = keyboard.nextLine();
        System.out.println("What is the student's last name?");
        String last = keyboard.nextLine();
        System.out.println("What is the student's first test score?");
        double a = keyboard.nextDouble();
        System.out.println("What is the student's second test score?");
        double b = keyboard.nextDouble();
        System.out.println("What is the student's third test score?");
        student.setTest(3, keyboard.nextDouble());
        student.setFirstName(first);
        student.setLastName(last);
        student.setTest(1, a);
        student.setTest(2, b);

        return student;
    }


}
