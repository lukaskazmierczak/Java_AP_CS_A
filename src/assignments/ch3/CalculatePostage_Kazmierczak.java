package assignments.ch3;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
I subtracted the oz from a truncated oz, if the result was greater than 0, it meant that there was a fraction, in which case i truncated the weight and added 1 to it. After that, I multiplied the rate by the weight.
 */
public class CalculatePostage_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many ounces?");
        double oz = keyboard.nextDouble();
        System.out.println("Mail type: priority-1 first class-2");
        int type = keyboard.nextInt();
        System.out.println(calculatePostage(oz, type));
    }
    private static double calculatePostage(double oz, int mailType){
        double cost = 0;
        if(mailType == 1 && oz <= 16 || mailType == 2 && oz > 13){
            cost = 3.5;
        }
        else if(mailType ==1 && oz > 16 || mailType == 2 && oz > 16){
            oz = oz/16;
            if (oz < 2){
                cost = 3.95;
            }
            else{
                if(oz - (int)(oz) > 0){
                    oz = (int)oz + 1;
                    cost = ((oz - 2) * 1.2 + 3.95);
                }
                else{
                    cost = ((oz - 2) * 1.2 + 3.95);
                }
            }
        }
        else if(mailType == 2 && oz <= 13){
            if(oz <= 1 && oz > 0){
                cost = .32;
            }
            else if(oz > 1){
                if(oz - (int)oz > 0) {
                    oz = (int) oz + 1;
                    cost = oz * .21 + .13;
                }
                else{
                    cost = oz * .21 + .13;
                }
            }
        }
        return cost;
    }
}
