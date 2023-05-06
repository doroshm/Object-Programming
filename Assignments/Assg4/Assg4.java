//import relevant java utilities
import java.util.Random;
import java.util.Scanner;

public class Assg4 {
    // declare required constants
    public static final int MAX_LENGTH = 10;
    public static final int START = -5;
    public static final int END = 25;
    public static final int ROWS = 10;
    public static final int COLS = 15;

    public static void main(String[] args) {
        // create Scanner
        Scanner in = new Scanner(System.in);
        // set the yesNo to yes to start automatically
        String yesNo = "yes";

        while (yesNo.toLowerCase().charAt(0) == 'y') {
            part1(in);
            part2(in);
            // ask user if they want to restart the program
            System.out.print("\nDo you want to keep running this program(Y/N): ");
            // redeclare answer
            yesNo = in.next();
        }
    }

    public static void question(String version) {
        System.out.printf("Do you want to %s subarray processing(Y/N): ", version);
    }

    public static int check2(int num, Scanner in, int version) {
        // to avoid redundancy we use a parameter to see which version it is depending
        // on if it is col or row
        int error = 0;
        if (version == 1) {
            error = 10;
        } else {
            error = 15;
        }

        //depending on parameters ask user to reenter value
        while (num <= 0 || num >= error) {
            System.out.printf("ERROR! Should be a positive integer and < %d. REENTER: ", error);
            num = in.nextInt();
        }
        //if correct return
        return num;
    }

    public static void arrPrint2(int[][] arr, boolean positive, int rows, int cols, String version) {
        // display table based on row and col parameters
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }

        // also display if the table contains some negative or all positive
        if (positive) {
            System.out.printf("All elements in %s are positive.\n", version);
        } else {
            System.out.printf("Some elements in %s are negative.\n", version);
        }

        System.out.println();
    }

    public static boolean allPositive(int[][] arr, int rows, int cols) {
        // check each index if value is positive or negative
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < 0) {
                    // stop if any are negative
                    return false;
                }
            }
        }
        // return true means all values are positive
        return true;
    }

    public static void arrFill2(int[][] arr) {
        // randomly generate numbers based on constants and fill array
        Random rand = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                arr[i][j] = rand.nextInt(END - START + 1) + START;
            }
        }
    }

    public static void part2(Scanner in) {
        // introduction
        System.out.println("Part 2:\nThe original table is:\n");
        // create array based on constants
        int[][] table = new int[ROWS][COLS];
        // fill array with random numbers
        arrFill2(table);
        // check if values are all positive using boolean
        boolean positive = allPositive(table, ROWS, COLS);
        // display results
        arrPrint2(table, positive, ROWS, COLS, "the original table");

        // ask user if they want to start processing subarray and store response
        question("start");
        String yesNo = in.next();
        while (yesNo.toLowerCase().charAt(0) == 'y') {
            // ask user for rows and check if within boundaries
            System.out.print("How many rows: ");
            int rows = check2(in.nextInt(), in, 1);

            // ask user for cols and check if within boundaries
            System.out.print("How many coloumns: ");
            int cols = check2(in.nextInt(), in, 2);

            // check if all positive again using the same method but different parameters
            System.out.println("The subarray is:\n");
            boolean positive2 = allPositive(table, rows, cols);
            // display results
            arrPrint2(table, positive2, rows, cols, "this subarray");

            // ask user if they want to create an new subarray
            question("continue");
            // redeclare variable
            yesNo = in.next();
        }
    }

    public static double arrEvenOdd(double[] arr, int remainder, String version) {
        // table headers
        System.out.printf("The elements with %s indexes are:\n%-8s%-8s\n==============\n", version, "Index", "Value");

        // generate sum while display each index and value for each line based on
        // remainder parameter
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == remainder) {
                total += arr[i];
                System.out.printf("%5d%8.2f\n", i, arr[i]);
            }
        }

        return total;
    }

    public static void arrSum(double sum, String version) {
        // display sum
        System.out.printf("The sum of the elements with %s indexes = %.2f\n\n", version, sum);
    }

    public static void arrDifference(double[] arr, double avg) {
        // table labels
        System.out.printf("%-8s%-8s%-10s\n============================\n", "Index", "Value", "Value - avg");
        // display each index, value, and difference for every line
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d%8.2f%14.2f\n", i, arr[i], arr[i] - avg);
        }

        System.out.println();
    }

    public static double arrAverage(double[] arr) {
        // goes through every value in arr and adds to total
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        // create new variable which finds avg
        double average = total / arr.length;
        // display result and return for later use
        System.out.printf("The average value = %.2f\n", average);
        return average;
    }

    public static void arrPrint(double[] arr) {
        System.out.println("The array elements are:");
        // use for loop to go through every idx in arr and print values
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void arrFill(Scanner in, double[] arr) {
        // continue while counter is not the same as the array length from parameter
        int counter = 0;
        while (counter != arr.length) {
            double x = in.nextDouble();
            // add each user's input to array by index
            arr[counter] = x;
            counter++;
        }
    }

    public static int check(int size, Scanner in) {
        // continue while user size is invalid
        while (size <= 0 || size > MAX_LENGTH) {
            System.out.print("ERROR! Should be a positive integer and <= 10. REENTER: ");
            size = in.nextInt();
        }
        // when valid return
        return size;
    }

    public static void part1(Scanner in) {
        // ask user if they want to start part 1
        System.out.print("Do you want to start(Y/N): ");
        // declare response and continue
        String yesNo = in.next();
        if (yesNo.toLowerCase().charAt(0) == 'y') {
            // ask user for arr size
            System.out.print("Part 1:\nEnter array size: ");
            // store user size
            int arrSize = check(in.nextInt(), in);
            // create arr based on user size
            double[] arr = new double[arrSize];

            // now ask user for values based on the size given
            System.out.printf("Now enter %d values:\n", arrSize);
            // fill the arr with the user's values
            arrFill(in, arr);
            // display results to user
            arrPrint(arr);

            // calculate avg based user's values
            double avg = arrAverage(arr);
            // then display the difference in a table
            arrDifference(arr, avg);

            // create table for even indexes in array
            double evenSum = arrEvenOdd(arr, 0, "even");
            // and calculate sum of new table
            arrSum(evenSum, "even");

            // create table for odd indexes in array
            double oddSum = arrEvenOdd(arr, 1, "odd");
            // and also calculate sum of new table but for odd
            arrSum(oddSum, "odd");
        }
    }
}