package assignments.ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class WordWrap_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)  throws FileNotFoundException {
        Scanner infile = new Scanner(new File("textfiles/wordWrap.txt"));
        System.out.println("Weight?");
        int weight = keyboard.nextInt();
        int count = -1;
        while(infile.hasNext()){
            String line = infile.nextLine();
            count += line.length() + 1;
            if(count > weight){
                count = -1;
                count += line.length() + 1;
                System.out.println();
                System.out.print(line + " ");
            }
            else{
                System.out.print(line + " ");
            }
        }
    }
}
