package assignments.ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*  ANSWER QUESTION HERE
If I had to do this with strings, I would check the length of each string rather than the value of each integer
 */
public class MergeFiles_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        Scanner file1 = new Scanner(new File("textfiles/file1.txt"));
        Scanner file2 = new Scanner(new File("textfiles/file2.txt"));
        ArrayList<Integer> file3 = new ArrayList<>();
        while(file1.hasNext() || file2.hasNext()){
            int line1 = file1.nextInt();
            int line2 = file2.nextInt();
            if(line1 > line2){
                file3.add(line2);
                file3.add(line1);
            }
            else if(line1 < line2){
                file3.add(line1);
                file3.add(line2);
            }
            else{
                file3.add(line1);
                file3.add(line2);
            }
        }
        file1.close();
        file2.close();
        System.out.println(file3);
    }
}
