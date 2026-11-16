package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
It is good
 */
public class PlayingTimes_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Playlist 1 length:");
        int t1 = keyboard.nextInt();
        System.out.println("Playlist 2 length:");
        int t2 = keyboard.nextInt();
        System.out.println("MP3 length:");
        int t = keyboard.nextInt();
        System.out.println(findBestFit(t1, t2, t));
    }
    private static int findBestFit(int t1, int t2, int t){
        int v = 0;
        if(t - t1- t2 >= 0){
            v = 3;
        }
        else if(t-t1 >= 0 || t1 == t2 && t-t1 >= 0){
            v = 1;
        }
        else if(t-t2 >= 0){
            v = 2;
        }
        return v;
    }
}
