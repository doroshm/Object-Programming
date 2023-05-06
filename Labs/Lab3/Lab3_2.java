import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        // introduction messege
        System.out.print("Please enter a number of rows and columns: ");
        Scanner in = new Scanner(System.in);
        // calls a method that uses the 2 different inputs as its parameters
        printGrid(in.nextInt(), in.nextInt());
        in.close();
    }

    public static void printGrid(int rows, int columns) {
        // the first loop represents the amounts of rows that should be printed
        for (int i = 1; i <= rows; i++) {
            // the nested loop starts with i and then goes up by the users rows
            for (int j = i; j <= columns * rows; j += rows) {
                System.out.print(j + " ");
            }
            // forces code to a new line
            System.out.println();
        }
    }
}