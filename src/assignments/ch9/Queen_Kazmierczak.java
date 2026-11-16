package assignments.ch9;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Queen_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] queen = new char[8][8];
        for(char[] x: queen){
            for(char y: x){
                y = '-';
            }
        }
        for(char[] x: queen){
            for(char y: x){
                System.out.print(y);
            }
            System.out.println();
        }
        System.out.println("Where would you like to place the queen?");
        System.out.println("Row: ");
        int row = keyboard.nextInt();
        System.out.println("Column: ");
        int col = keyboard.nextInt();
        queen[row][col] = 'Q';
        for(int i = 0; i < queen[row].length; i++){
            if(queen[i][col] != 'Q'){
                queen[i][col] = '*';
            }
            if(queen[row][i] != 'Q'){
                queen[row][i] = '*';
            }
            if(i + row <= 7 && i + row >= 0 && i + col <= 7 && i + col >= 0) {
                if (queen[i + row][i + col] != 'Q') {
                    queen[i + row][i + col] = '*';
                }
            }
            if(row - i <= 7 && row - i >= 0 && i + col <= 7 && i + col >= 0) {
                if (queen[row - i][i + col] != 'Q') {
                    queen[row - i][i + col] = '*';
                }
            }
            if(i + row <= 7 && i + row >= 0 && col - i <= 7 && col - i >= 0) {
                if (queen[i + row][col - i] != 'Q') {
                    queen[i + row][col - i] = '*';
                }
            }
            if(row - i <= 7 && row - i >= 0 && col - i <= 7 && col - i >= 0) {
                if (queen[row - i][col - i] != 'Q') {
                    queen[row - i][col - i] = '*';
                }
            }

        }
        for(char[] x: queen){
            for(char y: x){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
