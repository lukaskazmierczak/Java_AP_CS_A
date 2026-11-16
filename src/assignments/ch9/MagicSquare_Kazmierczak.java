package assignments.ch9;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class MagicSquare_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give an odd integer: ");
        int n = keyboard.nextInt();
        int[][] ms = new int[n][n];
        ms[0][n/2] = 1;
        int count = 2;
        int row = -1;
        int col = n/2+1;
        while(count <= n*n){
                if(col == n && row == -1){
                    col = n-1;
                    row = 1;
                }
                if(row == -1){
                    row = n-1;
                }
                if(col == n){
                    col = 0;
                }
                if(ms[row][col] != 0){
                    row++;
                    row++;
                    col--;
                }
                if(col == n && row == -1){
                    col = n-1;
                    row = 1;
                }
                if(row == -1){
                    row = n-1;
                }
                if(col == n){
                    col = 0;
                }
                if(ms[row][col] == 0){
                    ms[row][col] = count;
                }
                count++;
                row--;
                col++;
        }
        for(int[] x: ms){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
