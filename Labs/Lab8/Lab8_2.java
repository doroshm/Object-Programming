
//import relevant utility
import java.util.*;

public class Lab8_2 {
    // declare relevant constants
    public static final int START = 1;
    public static final int END = 20;

    public static void main(String[] args) {
        // create Scanner
        Scanner in = new Scanner(System.in);
        // ask user to start?
        question("start");
        // store answer from user
        String yesNo = in.next();
        // continue while answer is yes
        while (yesNo.toLowerCase().charAt(0) == 'y') {
            // ask user for size and store it
            System.out.print("Enter array size: ");
            int size = positive(in.nextInt(), in);
            // based on the user's size create an array
            int[] nums = new int[size];
            System.out.println("The array elements are:");
            // use a method to add elements to an array
            populate(nums);
            // use a method to print elements of the array populated
            printArray(nums);
            // display the histogram
            histogram(nums);
            // ask user if they want to continue
            question("continue");
            // redeclare answer from user
            yesNo = in.next();
        }
        // close scanner from receiving anymore inputs
        in.close();
    }

    public static void histogram(int[] nums) {
        // print top of histogram
        System.out.printf("%-10s%-10s%-10s\n", "Index", "Value", "Histogram");
        // print divider
        System.out.print("---------------------------------------\n");
        // loop through array and print each line with index, element value, and stars
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%-10d%-10d", i, nums[i]);
            String stars = "";
            // prints the relevant amount of stars based on the value of each element within
            // the array
            for (int j = 0; j < nums[i]; j++) {
                stars += "*";
            }
            System.out.printf("%-10s\n", stars);
        }
        System.out.println();
    }

    public static void printArray(int[] nums) {
        // loops through each elements and prints them
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void populate(int[] nums) {
        // create random
        Random rand = new Random();
        // loops through each index of array and adds each random element for each index
        for (int i = 0; i < nums.length; i++) {
            int element = rand.nextInt(END - START + 1) + START;
            nums[i] = element;
        }
    }

    public static int positive(int size, Scanner in) {
        // checks if the user's size is less than or equal to 0, and ask to reenter
        // since it has to be positive
        while (size <= 0) {
            System.out.print("ERROR! Should be a positive integer. REENTER: ");
            size = in.nextInt();
        }
        return size;
    }

    public static void question(String word) {
        System.out.printf("Do you want to %s(Y/N): ", word);
    }
}