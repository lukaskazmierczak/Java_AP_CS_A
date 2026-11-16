package assignments.ch7;

import net.apcs.classes.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class ReadStudents_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("textfiles/Students.txt"));
        ArrayList<Student> students = new ArrayList<>();
        while (file.hasNext()) {
            String line = file.nextLine();
            String[] stuff = line.split(",");
            Student stu = new Student(stuff[0], stuff[1]);
            stu.setTest(1, Double.valueOf(stuff[2]));
            stu.setTest(2, Double.valueOf(stuff[3]));
            stu.setTest(3, Double.valueOf(stuff[4]));
            students.add(stu);
        }
        file.close();
        System.out.println(bestStudent(students));
    }
    public static Student bestStudent(ArrayList<Student> a) {
        Student best = a.get(0);
        for(Student ab : a){
            if((ab.getTest(1) + ab.getTest(2) + ab.getTest(2))/3 > (best.getTest(1) + best.getTest(2) + best.getTest(3))/3){
                best = ab;
            }
        }
        return best;
    }
}
