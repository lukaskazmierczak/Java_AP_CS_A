package assignments.ch7.section03;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class MaxSpan_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[] max1 = {1, 2, 1, 3, 3};
        System.out.println(maxSpan(max1));
        int[] max2 = {1, 3, 2, 1, 4, 7, 4};
        System.out.println(maxSpan(max2));
        int[] max3 = {1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(max3));
    }
    private static double maxSpan(int[] a){
        int correct = 0;
        int span = 0;
        int max;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[a.length-j-1] == a[i]){
                    max = a.length-j-1;
                    span = max - i;
                }

                if(span > correct){
                    correct = span;
                }
            }
        }
        return correct + 1;
    }

}

