import net.apcs.Input;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class DeleteMe {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int size = Input.getInt();
        int stop = (size + 1)/2;
        for(int i = size - 1; i >= stop; i--) {
            System.out.println(2*stop-i-1 + " " + i);
        }
    }
}
