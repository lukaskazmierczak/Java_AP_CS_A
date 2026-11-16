package assignments.ch7.section03;

import assignments.ch5.section06.StaticStudent;

import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
Yes, make a method that takes names from an array and uses Math.random to generate random test scores.
 */
public class FilterStudents_LastName {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<StaticStudent> students = new ArrayList<StaticStudent>();
        students.add(StaticStudent.randomStudent());
        students.add(StaticStudent.randomStudent());
        students.add(StaticStudent.randomStudent());
        students.add(StaticStudent.randomStudent());
        students.add(StaticStudent.randomStudent());
        students.add(StaticStudent.randomStudent());
        students.add(StaticStudent.randomStudent());
        students.add(StaticStudent.randomStudent());

        for(StaticStudent stu : students) {
            System.out.println(stu);
        }

        ArrayList<StaticStudent> needsHelp = filterStudents(students);

        System.out.println(students);
        System.out.println(needsHelp);
    }

    private static ArrayList<StaticStudent> filterStudents(ArrayList<StaticStudent> students) {
        ArrayList<StaticStudent> stu = new ArrayList<>();
        for(StaticStudent student : students){
            if(student.getAverage() > 70){
                stu.add(student);
            }
        }
        return students;
    }
}
