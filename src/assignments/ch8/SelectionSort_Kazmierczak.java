package assignments.ch8;

import net.apcs.classes.Student;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
very little, I just have to define the objects individually and then place them into the list rather than defining them in the list.
 */
public class SelectionSort_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Student carry;
        Student one = new Student("Bob", "Job");
        Student two = new Student("Cob", "Lob");
        Student three = new Student("Sob", "Fob");
        Student[] list = {one, two, three};
        for(int i = 0; i<list.length; i++){
            for(int j = 0; j<list.length; j++){
                carry = list[j];
                if(list[i].getLastName().compareTo(list[j].getLastName()) > 0){
                    list[j] = list[i];
                    list[i] = carry;
                }
            }
        }
        for(Student item: list){
            System.out.println(item);
        }
    }
}
