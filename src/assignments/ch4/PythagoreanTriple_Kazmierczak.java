package assignments.ch4;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Very good, they were complicated to start but now they are
 */
public class PythagoreanTriple_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        for(int i = 1; i < 101; i++){
            for(int j = 1; j < 101; j++){
                if(Math.sqrt(i*i + j*j) % 1 == 0){
                    System.out.println(i + " " + j + " " + Math.sqrt(i*i + j*j));
                }
            }
        }
    }
}
