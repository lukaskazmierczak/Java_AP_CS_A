package assignments.ch7.section06;
/**
 * Created by jsmith on 2/23/2019.
 */

import java.util.Scanner;

/*  YOU MUST RENAME THE FILE
        1. Put the cursor on SortAndSearch_LastName
        2. Hit Shift + F6
        3. Change LastName to your last name
        4. Hit 'Enter'
 */
public class SortAndSearch_LastName {

    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        // This method does not need to be changed
        int numOfItems;
        int[] numbers;
        int input = 0;

        System.out.print("How many integers would you like in the array? ");
        numOfItems = console.nextInt();

        numbers = buildArray(numOfItems);
        printArray(numbers, 0, numbers.length);
        System.out.println();
        printArray(numbers, 0, numOfItems);
        sort(numbers, 0, numOfItems);
        System.out.println();
        printArray(numbers, 0, numOfItems);

        // Interact with the array
        System.out.println("Enter a number.  " +
                "If it finds the number, it will be removed." +
                "If it does not find the number, it will add it." +
                "Use -1 to exit the program.");
        System.out.print("What number would you like to look for? ");
        input = console.nextInt();
        while (input != -1) {

            int loc = binarySearch(numbers, numOfItems, input);
            System.out.println(loc);

            if (loc < 0) {
                System.out.println("The number " + input + " is not in the array");
                System.out.println("The number belongs at location " + ~loc);
                System.out.println("Adding it . . .");
                insertElement(numbers, input, -loc - 1, numOfItems);
                numOfItems++;
            } else {
                System.out.println("The number " + input + " is in the array.");
                System.out.println("It is located at position " + loc);
                System.out.println("Removing it . . . ");
                removeAt(numbers, loc, numOfItems);
                numOfItems--;
            }
            printArray(numbers, 0, numOfItems);

            System.out.print("What number would you like to look for? ");
            input = console.nextInt();
        }

    }

    public static void printArray(int[] a, int from, int to) {
    // Print all the elements from <from> up to but not including <to>
        for(int i = 0; i < a.length; i++){
            if(i >= from && i < to){
                System.out.println(a[i]);
            }
        }
    }

    public static int[] buildArray(int numOfElements) {
    // This method should create an array of 100 elements
    // This method should fill the array with numOfElements integers
    // The integers should be random numbers between -1000 and 1000
    // There should not be any duplicate values in the array.
    // Use the isDuplicate method writing this method
        int[] array = new int[100];
        for(int i = 0; i < numOfElements; i++){
            int rand = (int)(Math.random() * 2001) - 1000;
            array[i] = rand;

        }
        isDuplicate(array);
        return array;
    }

    public static boolean isDuplicate(int[] a) {
        // find and remove any duplicate numbers in the array
        int sum = 0;
        int total = 0;
        boolean ret = false;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j]){
                    sum++;
                }
            }
            if(sum > 1){
                total++;
                removeAt(a, i, a.length);

            }
            sum = 0;
        }
        if(total > 0){
            ret = true;
        }
        return ret;

    }

    public static void sort(int[] a, int from, int to) {
    // Implement a Selection sort on the array
    // it should start at <from> and goto <to>

        for(int i = from; i < to; i++){

            for(int j = from; j < to; j++){
                int carry = a[i];
                if(a[j] > a[i]){
                    a[i] = a[j];
                    a[j] = carry;
                }
            }
        }
    }

    public static int binarySearch(int[] a, int numberOfItems, int target) {
    // Implement binary search as demonstrated in class.
    // This implementation of the binarySearch algorithm should return a positive index if the number is found.
    // If the number is not found, then it will return the (index * -1 - 1).
    // For example if the element is supposed to appear at index 10 this method will return -11.
    // This is because you can take -11 * -1 - 1 and get back to 10!  :)
        int min = 0;
        int max = numberOfItems;
        int guess = 0;
        while(min < max){
            guess = (min + max)/2;
            if(a[guess] < target){
                min = guess + 1;
            }
            else if(a[guess] > target){
                max = guess;
            }
            else{
                return guess;
            }
        }
        return (guess * -1) - 1;
    }

    public static void removeAt(int[] a, int loc, int numOfItems) {
    // remove the element at loc
    // this means you will need to shift elements to the left
        int numElim = 0;
        a[loc] = 9999;
        for(int k = 0; k < a.length; k++){
            if(a[k] != 9999){
                a[k - numElim] = a[k];
            }
            else{
                numElim++;
            }
        }


    }

    public static void insertElement(int[] a, int itemToAdd, int addAt, int numOfItems){
    // insert <itemToAdd> into the array at <addAt> the correct location
    // this means you will need to shift elements to the right
        for(int i = numOfItems; i > 0; i--){
            if(i >= addAt){
                a[i + 1] = a[i];

            }
        }

        a[addAt] = itemToAdd;
    }
}
