
package assignments.ch4;
import java.util.Scanner;
/*  ANSWER QUESTION HERE
I would make a loop that increased by one starting from input/2 5 times (i), then I would make another loop that would print input/2 spaces decreasing followed by 1 + 2 * (i-(input/2)).
*/
public class IsoTri_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        int lines = keyboard.nextInt();
        for(int i = 1; i <= lines; i++) {
            printChar(i, "*");
        }
        for(int j = lines; j > 0; j--){
            printOther(j, "*");
        }
    }
    private static void printChar(int n, String ch){
        for(int i = 0; i < n-1; i++){
            System.out.print(ch);
        }
        System.out.println();


    }
    private static void printOther(int n, String ch){
        for(int i = n; i > 0; i--){
            System.out.print(ch);
        }
        System.out.println();


    }


}
