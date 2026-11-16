package assignments.ch3;

import net.apcs.classes.Student;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I would have to copy and paste the code 15 times and make many adjustments. A more effective solution would be to make the code loop for the number of students there are.
 */
public class RankingStudents_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Student studenta = new Student();
        Student studentb = new Student();
        System.out.println("What is the student's first name?");
        String firsta = keyboard.nextLine();
        System.out.println("What is the student's last name?");
        String lasta = keyboard.nextLine();
        System.out.println("What is the student's first name?");
        String firstb = keyboard.nextLine();
        System.out.println("What is the student's last name?");
        String lastb = keyboard.nextLine();
        System.out.println("What is the student's first test score?");
        double a1 = keyboard.nextDouble();
        System.out.println("What is the student's second test score?");
        double a2 = keyboard.nextDouble();
        System.out.println("What is the student's third test score?");
        double a3 = keyboard.nextDouble();
        System.out.println("What is the student's first test score?");
        double b1 = keyboard.nextDouble();
        System.out.println("What is the student's second test score?");
        double b2 = keyboard.nextDouble();
        System.out.println("What is the student's third test score?");
        double b3 = keyboard.nextDouble();
        studenta.setFirstName(firsta);
        studenta.setLastName(lasta);
        studenta.setTest(1, a1);
        studenta.setTest(2, a2);
        studenta.setTest(3, a3);
        studentb.setFirstName(firstb);
        studentb.setLastName(lastb);
        studentb.setTest(1, b1);
        studentb.setTest(2, b2);
        studentb.setTest(3, b3);
        printStudents(studenta, studentb);
    }
    private static void printStudents(Student first, Student second){
        System.out.println("Average test score ranking:");
        if(first.getAverage() > second.getAverage()){
            System.out.println(first.getFirstName() + " " + first.getLastName());
            System.out.println(second.getFirstName() + " " + second.getLastName());
        }
        else if(first.getAverage() < second.getAverage()){
            System.out.println(second.getFirstName() + " " + second.getLastName());
            System.out.println(first.getFirstName() + " " + first.getLastName());
        }
        System.out.println("Highest test score ranking:");
        if(first.getHighScore() > second.getHighScore()){
            System.out.println(first.getFirstName() + " " + first.getLastName());
            System.out.println(second.getFirstName() + " " + second.getLastName());
        }
        else if(first.getHighScore() < second.getHighScore()){
            System.out.println(second.getFirstName() + " " + second.getLastName());
            System.out.println(first.getFirstName() + " " + first.getLastName());
        }
    }

}
