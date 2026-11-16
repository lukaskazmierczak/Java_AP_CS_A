package assignments.ch9;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
its a list that holds lists
 */
public class FindFirstNegative_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] list = {
                {1,2,3,4,5,},
                {3,2,-1,5,9},
                {-1, -2, -5, -6,-3}
        };
        int[] result = findFirstNegative(list);
        for(int x : result){
            System.out.println(x);
        }
    }
    private static int[] findFirstNegative(int[][] a){
        int[] first = new int[2];
        boolean found = false;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] < 0){
                    first[0] = i;
                    first[1] = j;
                    found = true;
                }
                if(found == true){
                    break;
                }
            }
            if(found == true){
                break;
            }
        }
        if(found == false){
            first[0] = a.length;
            first[1] = a[0].length;
        }
        return first;

    }
}
