package assignments.ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Numbers_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException{
        Scanner infile = new Scanner(new File("textfiles/numbers.txt"));
        int max = 0;
        int min = 999999999;
        int sum = 0;
        int count = 0;
        while(infile.hasNext()){
            int num = infile.nextInt();
            if(num > max){
                max = num;
            }if(num < min){
                min = num;
            }
            sum += num;
            count++;
        }
        double av = sum/count;
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(av);

    }
}
