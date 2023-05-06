//import relevant utilities for user input
import java.util.Scanner;

public class Lab9_1 {
    public static void main(String[] args) {
        // create the Scanner
        Scanner in = new Scanner(System.in);
        // ask user if they want to start
        question("start");
        // store user's answer
        String yesNo = in.next();
        // while answer is yes then continue
        while (yesNo.toLowerCase().charAt(0) == 'y') {
            // ask user for size of table
            System.out.print("Enter an integer m (3 - 20): ");
            // store user's input by using a method to check if it is within range
            int size = check(in.nextInt(), in);
            System.out.printf("0 to %d multiplication table\n", size);
            System.out.print("=============================\n");
            // create 2d array
            int[][] nums = new int[size + 1][size + 1];
            // call method to fill 2d array
            populate(nums, size);
            // call method to print 2d array
            output(nums, size);
            // ask user if they want to continue
            question("continue");
            // redeclare yesNo
            yesNo = in.next();
        }
    }

    public static void output(int[][] nums, int size) {
        // uses a 2d for loop that goes through each row and col to print each element
        // in the array
        // uses size for each loop's outerbound to know when to stop
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                System.out.printf("%4d", nums[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void populate(int[][] nums, int size) {
        // uses a 2d for loop that goes through each row and col to fill it with an
        // element
        // the element is calculated by multiplying the row num by col num
        for (int i = 0; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                nums[i][j] = i * j;
            }
        }
    }

    public static int check(int size, Scanner in) {
        // continues if user's size is out of range and asks to reenter
        while (size < 3 || size > 20) {
            System.out.print("ERROR! Valid range: 3 - 20! REENTER: ");
            size = in.nextInt();
        }
        return size;
    }

    // method used to avoid repetition with start and continue
    public static void question(String word) {
        System.out.printf("Do you want to %s(Y/N): ", word);
    }
}