import java.util.Random;

public class Lab9_2 {
    // declares relevant class constants
    public static final int ROWS = 10;
    public static final int COLS = 15;
    public static final int START = 1;
    public static final int END = 400;

    public static void main(String[] args) {
        // creates 2d array using the constants
        int[][] nums = new int[ROWS][COLS];
        // uses method to fill the array with random integers within the range
        populate(nums);
        System.out.println("The array elements are:\n");
        // prints the array elements using a method
        printArray(nums);
        System.out.println("Row 2 elements are:");
        // prints the arrays second row
        printRow2(nums);
        System.out.println("Column 3 elements are:");
        // prints the arrays third column
        printCol3(nums);
        // uses methods to find smallest and largest num within the 2d array
        int largest = largest(nums);
        int smallest = smallest(nums);
        // prints the largest and smallest nums
        System.out.printf("The range of values in the array: %d - %d\n", smallest,
                largest);
        // uses a method to calculate the sum
        int sum = sum(nums);
        // prints sum
        System.out.printf("The sum of all elements in the array = %d\n", sum);
        // based on the sum we can calculate the average
        double average = (double) sum / (ROWS * COLS);
        // prints average
        System.out.printf("The average of all elements in the array = %.2f",
                average);
    }

    public static int sum(int[][] nums) {
        int sum = 0;
        // uses 2d for loop to go through each element and add it to the sum
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                sum += nums[i][j];
            }
        }
        return sum;
    }

    public static int largest(int[][] nums) {
        int largest = START;
        // uses 2d for loop to go through each element and check if it is larger than
        // the largest
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (nums[i][j] > largest) {
                    largest = nums[i][j];
                }
            }
        }
        return largest;
    }

    public static int smallest(int[][] nums) {
        int smallest = END;
        // uses 2d for loop to go through each element and check if it is smaller than
        // the smallest
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (nums[i][j] < smallest) {
                    smallest = nums[i][j];
                }
            }
        }
        return smallest;
    }

    public static void printCol3(int[][] nums) {
        // goes through each row and prints the element in the 3 col
        for (int i = 0; i < ROWS; i++) {
            System.out.printf("%5d", nums[i][2]);
        }
        System.out.println();
    }

    public static void printRow2(int[][] nums) {
        // goes through each col and prints the elements in the 2 row
        for (int i = 0; i < COLS; i++) {
            System.out.printf("%5d", nums[1][i]);
        }
        System.out.println();
    }

    public static void printArray(int[][] nums) {
        // goes through each element within the 2d array and prints
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.printf("%5d", nums[i][j]);
            }
            // forces code to move to next line
            System.out.println();
        }
        System.out.println();
    }

    public static void populate(int[][] nums) {
        // declare and create random
        Random rand = new Random();
        // go through each position within the array
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                // redeclare the element in each position with a random integer within the
                // constant range
                nums[i][j] = rand.nextInt(END - START + 1) + START;
            }
        }
    }
}