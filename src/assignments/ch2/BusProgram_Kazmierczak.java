package assignments.ch2;

import java.util.Scanner;

/*  ANSWER QUESTION HERE
Change the 15 on line 37 to 12
 */
public class BusProgram_Kazmierczak {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many passengers?");
        int people = keyboard.nextInt();
        System.out.println("How many miles?");
        int miles = keyboard.nextInt();
        int cost = 0;
        System.out.println("People: " + people);
        System.out.println("Miles: " + miles);
        if (miles>149 && miles < 201){
            cost = 20;
        }
        else if (miles>200 && miles < 401){
            cost = 25;
        }
        else if (miles>400 && miles < 801){
            cost = 30;
        }
        else if (miles>800 && miles < 1201){
            cost = 40;
        }
        else if (miles>1200 && miles < 1601){
            cost = 50;
        }
        System.out.println("Ticket price: " + cost);
        int bus = 0;
        if(people - ((people/50)*50) > 33){
            bus += 1;
        }
        bus += (people/50);
        double van = (people-(bus * 50))/15;
        if(van < 0){
            van = 0;
        }
        if (van - (van%1) > 0){
            van += 1;
        }
        System.out.println("Buses: " + bus);
        System.out.println("Vans: " + van);
        double gross = cost * people;
        System.out.println("Gross Profit: " + gross);
        double work = (van * .75 * miles) + (bus * 1.75 * miles);
        System.out.println("Maintenance Cost:" + work);
        System.out.println("Net Profit: " + (gross - work));
    }
}
