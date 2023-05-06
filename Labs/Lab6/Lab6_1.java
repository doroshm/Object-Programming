
//imports util so we can use the Scanner
import java.util.*;

public class Lab6_1 {
    public static void main(String[] args) {
        // creates Scanner
        Scanner in = new Scanner(System.in);

        // requests if the user wants to "start"
        question("start");

        // declares a string for the user's response
        String yesNo = in.next();

        // takes the char from the 1st index of yesNo and makes it lowercase
        // also checks if it's equal to 'y'
        while (yesNo.toLowerCase().charAt(0) == 'y') {
            // asks user for input
            requestInteger();

            // declares a decimal, but calls a method to ask for reentry if the input is
            // negative
            int decimal = positive(in.nextInt(), in);
            // declares a new string for binary
            String binary = convert(decimal);

            // prints results
            System.out.printf("%s in binary is %s.\n\n", decimal, binary);

            // requests if the user wants to "continue"
            question("continue");

            // redeclares yesNo
            yesNo = in.next();
        }

        // stops awaiting new inputs
        in.close();
    }

    public static String convert(int input) {
        // returns the user's input
        System.out.printf("You entered %d.\n", input);
        // declares empty string for binary
        String binary = "";

        // makes an exception for 0
        if (input == 0) {
            return "0";
        } else {
            while (input != 0) {
                // finds remainder
                int remainder = input % 2;
                // places the remainder in the front of the string
                binary = remainder + binary;
                // no we can divide
                input /= 2;
            }
        }

        return binary;
    }

    public static void question(String word) {
        // uses the parameter to alter the question
        System.out.printf("Do you want to %s(Y/N): ", word);
    }

    public static void requestInteger() {
        System.out.print("Enter an integer and I will convert it to binary code: ");
    }

    public static int positive(int decimal, Scanner in) {
        // continues to ask for a new number as long as it's negative
        while (decimal < 0) {
            System.out.print("That is a negative number! Reenter: ");
            decimal = in.nextInt();
        }

        return decimal;
    }
}
