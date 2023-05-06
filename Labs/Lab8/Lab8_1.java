//import relevant utility
import java.util.*;

public class Lab8_1 {
    // declare relevant constants
    public static final int START = 0;
    public static final int END = 100;
    public static final int LINE = 5;
    public static final int SIZE = 25;

    public static void main(String[] args) {
        // create Scanner
        Scanner in = new Scanner(System.in);
        // ask user to start?
        question("start");
        // store answer from user
        String yesNo = in.next();
        // continue while answer is yes
        while (yesNo.toLowerCase().charAt(0) == 'y') {
            // create array using SIZE constant
            int[] nums = new int[SIZE];
            // use methods to populate array, print table, and determine largest or smallest
            // integer
            populate(nums);
            table(nums);
            int largest = largest(nums);
            int smallest = smallest(nums);
            // prints largest and smallest, and the difference
            System.out.printf("The largest element %d - the smallest element %d = %d\n\n", largest, smallest, (largest - smallest));
            // ask user once again to continue?
            question("continue");
            yesNo = in.next();
        }
        // close scanner
        in.close();
    }

    public static int largest(int[] nums) {
        // declares largest to the smallest possible integer which is the START
        int largest = START;
        // loops through array determining if each integer is greater than largest
        for (int i = 0; i < SIZE; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static int smallest(int[] nums) {
        // declares smallest to the largest possible integer which is the END
        int smallest = END;
        // loops through array determining if each integer is less than smallest
        for (int i = 0; i < SIZE; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void table(int[] nums) {
        // prints results by looping through array
        for (int i = 1; i <= SIZE; i++) {
            // "i-1" because we do not want to miss the first element in the array
            System.out.printf("%4d", nums[i - 1]);
            // check if the end of the line has been reached and move to next line
            if (i % LINE == 0) {
                System.out.println();
            }
        }
    }

    public static void populate(int[] nums) {
        // initialize random
        Random rand = new Random();
        // randomly generate elements for the array and add them
        for (int i = 0; i < SIZE; i++) {
            int element = rand.nextInt(END - START + 1) + START;
            nums[i] = element;
        }
    }

    public static void question(String word) {
        System.out.printf("Do you want to %s(Y/N): ", word);
    }
}
