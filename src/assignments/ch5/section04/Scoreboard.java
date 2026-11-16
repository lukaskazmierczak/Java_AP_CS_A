package assignments.ch5.section04;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
class Scoreboard {

    private static Scanner keyboard = new Scanner(System.in);
        int score1 = 0;
        int score2 = 0;
        String team1;
        String team2;
        int active = 1;


    public Scoreboard(String t1, String t2){
        team1 = t1;
        team2 = t2;
    }
    public void recordplay(int num){
        if(num == 0){
            if(active == 1){
                active = 2;
            }
            else if(active == 2){
                active = 1;
            }
        }
        if(num>0){
            if(active == 1){
                score1 += num;
            }
            else if(active == 2){
                score2 += num;
            }
        }
    }
    public String getScore(){
        String rvalue = "HA";
        if(active == 1){
            rvalue = score1 + " - " + score2 + " Active: " + team1;
        }
        else if(active == 2){
            rvalue =  score1 + " - " + score2 + " Active: " + team2;
        }
        System.out.println(rvalue);
        return rvalue;
    }
}
