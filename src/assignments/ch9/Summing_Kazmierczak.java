package assignments.ch9;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
yes, I could check if all of the methods have equal values in their arrays, if so: true, else: false
 */
public class Summing_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Matrix size?");
        int size = keyboard.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Please fill the matrix");
        fillMatrix(matrix);
        for(int[] x : matrix){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

        for(int x : getRowSums(matrix)){
            System.out.println(x);
        }
        System.out.println();
        for(int x : getColSums(matrix)){
            System.out.println(x);
        }
        System.out.println();
        for(int x : getDiagSums(matrix)){
            System.out.println(x);
        }
        ;
    }
    private static void fillMatrix(int[][]a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                int fill = keyboard.nextInt();
                a[i][j] = fill;
            }
        }
    }
    private static int[] getRowSums(int[][]a){
        int[] row = new int[a.length];
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int x : a[i]){
                sum += x;
                row[i] = sum;
            }
            sum = 0;
        }
        return row;
    }
    private static int[] getColSums(int[][]a){
        int[] col = new int[a.length];
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                sum += a[j][i];
                col[i] = sum;
            }
            sum = 0;
        }
        return col;
    }
    private static int[] getDiagSums(int[][]a){
        int[] diag = new int[2];
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i == j){
                    sum +=a[i][j];
                }
            }
        }
        diag[0] = sum;
        sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i + j == a.length-1){
                    sum +=a[i][j];
                }
            }
        }
        diag[1] = sum;
        return diag;
    }

}
