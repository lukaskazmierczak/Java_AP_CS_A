package assignments.ch1;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
//Calculate net profit: gross profit - costs
public class BusProgram01_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        final int Vc = 1;
        final double Bc = 2.5;
        final int Vm = 3;
        final int Bm = 5;
        System.out.println("How many buses?");
        int bus = keyboard.nextInt();
        System.out.println("How many vans?");
        int van = keyboard.nextInt();
        System.out.println("How many miles travelled?");
        double miles = keyboard.nextInt();
        double Vcost = miles * van * Vc;
        double Bcost = miles * bus * Bc;
        double cost = Vcost + Bcost;
        System.out.println("Maintenance Costs: " + cost);
        double Vpro = Vm * miles * van;
        double Bpro = Bm * miles * bus;
        double profit = Vpro + Bpro;
        System.out.println("Gross Profit: " + profit);
        double net = profit - cost;
        System.out.println("Net Profit: " + net);
    }
}
