package assignments.ch10;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
public class Recursion2D_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] pic =  { { 'r', 'b', 'b', 'b', 'b', 'b', 'r', 'b', 'g', 'g', 'r'},
                { 'b', 'g', 'r', 'g', 'b', 'b', 'b', 'b', 'b', 'g', 'r'},
                { 'g', 'r', 'b', 'r', 'b', 'b', 'g', 'g', 'b', 'g', 'r'},
                { 'r', 'b', 'g', 'b', 'r', 'b', 'g', 'g', 'b', 'g', 'g'},
                { 'r', 'g', 'b', 'g', 'r', 'g', 'g', 'r', 'b', 'g', 'g'},
                { 'r', 'b', 'b', 'b', 'r', 'b', 'b', 'b', 'b', 'b', 'b'},
                { 'g', 'r', 'g', 'r', 'g', 'b', 'b', 'r', 'g', 'g', 'b'},
                { 'g', 'b', 'r', 'b', 'b', 'g', 'b', 'r', 'g', 'r', 'b'},
                { 'b', 'g', 'g', 'g', 'g', 'b', 'r', 'r', 'g', 'g', 'b'},
                { 'r', 'b', 'g', 'r', 'b', 'b', 'r', 'g', 'g', 'b', 'b'},
                { 'g', 'b', 'b', 'r', 'r', 'r', 'r', 'g', 'g', 'b', 'b'} };
        printPic(pic);
        System.out.println();
        fill(pic,0, 1, 'b', 't');
        printPic(pic);
        System.out.println();
    }
    public static void fill(char[][] pic, int row, int col, char oldColor, char newColor){
        if (pic[row][col] == oldColor)
        {
            pic[row][col] = newColor;

            // Start Coding Here
            if(isValid(row, col+1, pic)){
                fill(pic, row, col+1, oldColor, newColor);
            }
            if(isValid(row+1, col, pic)){
                fill(pic, row+1, col, oldColor, newColor);
            }
            if(isValid(row, col-1, pic)){
                fill(pic, row, col-1, oldColor, newColor);
            }
            if(isValid(row-1, col, pic)){
                fill(pic, row-1, col, oldColor, newColor);
            }
        }
    }
    static void printPic(char[][] pic)
    {
        for (int i = 0; i < pic.length; i++)
        {
            for (int j = 0; j < pic[i].length; j++)
            {
                System.out.print(pic[i][j]);
            }
            System.out.println();
        }
    }
    static boolean isValid(int row, int col, char[][] pic)
    {
        boolean result = row > -1 && row < pic.length && col > -1 && col < pic[0].length;
        return result;
    }


}
