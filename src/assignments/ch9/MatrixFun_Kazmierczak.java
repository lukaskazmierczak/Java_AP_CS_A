package assignments.ch9;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class MatrixFun_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] a = populate(3,5);
        for(int[] x : a){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println(countIncreasingCols(a));
    }
    public static int[][] populate(int row, int col){
        int[][] array = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int num = (int)(Math.random()*2646+1);
                if(num % 10 == 0 && num % 100 != 0){
                    array[i][j] = num;
                }
                else{
                    j--;
                }
            }
        }
        return array;
    }
    public static int countIncreasingCols(int[][] a){
        int num = 0;
        boolean inc = true;
        if(a.length == 1){
            return a[0].length;
        }
        for(int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if(a[j][i] > a[j+1][i]){
                    inc = false;
                }
            }
            if(inc == true){
                num++;
            }
            inc = true;
        }
        return num;
    }




}
