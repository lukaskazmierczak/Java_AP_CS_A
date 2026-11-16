package assignments.ch10;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class TriangleSum_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a triangle length: ");
        int num = keyboard.nextInt();
        int s = triangleSum(num);
        System.out.println(s);
    }
    private static int triangleSum(int num){
        int sum = 0;
        if(num == 0){
            return sum;
        }
        else{
            sum += num + triangleSum(num-1);
        }
        return sum;
    }
}
