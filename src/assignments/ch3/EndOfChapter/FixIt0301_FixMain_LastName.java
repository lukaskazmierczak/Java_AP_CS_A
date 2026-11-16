package assignments.ch3.EndOfChapter;

import java.util.Scanner;

/*  ANSWER QUESTION HERE

 */
class FixIt0301_FixMain_LastName
{
    public static Scanner console = new Scanner(System.in);

    public static void main(String [] args)
    {

        int count;
        int numOfNums;
        int j;
        int k;
        int l;
        double total;
        int big;

        int lineCount = getInt("How many sides on the triangle? ");
        printTriangle(lineCount);

        System.out.println("-- Break --");

        numOfNums = getInt("How many doubles should you enter? ");
        total = askForXNums(3);
        System.out.println("Total is " + total);

        System.out.println("-- Break --");

        j = getInt("Enter a number: ");
        k = getInt("Enter a number: ");
        l = getInt("Enter a number: ");

        System.out.println("Biggest Number is: ");
        mystery(j,k,l);
        System.out.println("End");



    }

    /*        DO NOT CHANGE ANYTHING
              BELOW HERE !!!!             */

    public static int getInt(String msg)
    {
        int i;
        System.out.println(msg);
        i = console.nextInt();
        return i;
    }

    public static void printTriangle(int numOfLines)
    {
        for(int i = 1; i <= numOfLines; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static double askForXNums(int X)
    {
        double sum = 0;
        for(int i = 1; i <= X; i++)
        {
            System.out.print("Enter #" + i + ":");
            sum = sum + console.nextDouble();
        }
        return sum;
    }

    public static void mystery(int x, int y, int z)
    {
        if (x > y && x > z)
            System.out.println(x);
        if (y > x && y > z)
            System.out.println(y);
        if (z > x && z > y)
            System.out.println(z);
    }
}
/*
You will input the following
5
5
12
34.5
23.1
11.4
8
10
14
5
The output should be this....

How many sides on the triangle?
5
*
**
***
****
*****
-- Break --
How many doubles should you enter?
5
Enter #1:12
Enter #2:34.5
Enter #3:23.1
Enter #4:11.4
Enter #5:8
Total is 89.0
-- Break --
Enter a number:
10
Enter a number:
14
Enter a number:
5
Biggest Number is
14
End
Press any key to continue . . .
*/