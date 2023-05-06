//imports Scanner so we can use it
import java.util.Scanner;

public class Lab5_3 {
    public static void main(String[] args) {
        // creates Scanner object
        Scanner in = new Scanner(System.in);
        // prints introduction messege
        introduction();
        // asks user for the amount inputs
        System.out.print("How many numbers? ");
        int inputs = in.nextInt();
        // tests if the inputs is less than 1
        while (inputs < 1) {
            // prompts to user to reenter if it is not positive
            System.out.print("ERROR! Should be positive. Reenter: ");
            inputs = in.nextInt();
        }
        // calls method to figure out what type of card the integer is
        cards(inputs, in);
    }

    public static void introduction() {
        System.out.println("Playing cards program.");
        System.out.println("Give me some numbers and");
        System.out.println("I will tell you the appropiate playing card.");
        System.out.println("============================================");
    }

    public static void cards(int inputs, Scanner in) {
        // sets amount to 0 for start
        int amount = 0;
        // while loop to stop until amount is the same as inputs
        while (amount != inputs) {
            // asks user for number
            System.out.print("Enter card number: ");
            // stores integer
            int integer = in.nextInt();
            // checks if integer is valid
            while (integer < 1 || integer > 14) {
                // asks user to reenter if integer does not fall within range
                System.out.print("ERROR! Out of range (1-14). Reenter: ");
                // redeclares variable
                integer = in.nextInt();
            }
            // delcares output to be used for result
            String output = "";
            // switch is created that checks what the integer represents
            switch (integer) {
                case 2:
                    output = "two";
                    break;
                case 3:
                    output = "three";
                    break;
                case 4:
                    output = "four";
                    break;
                case 5:
                    output = "five";
                    break;
                case 6:
                    output = "six";
                    break;
                case 7:
                    output = "seven";
                    break;
                case 8:
                    output = "eight";
                    break;
                case 9:
                    output = "nine";
                    break;
                case 10:
                    output = "ten";
                    break;
                case 1:
                case 11:
                    output = "Ace";
                    break;
                case 12:
                    output = "Jack";
                    break;
                case 13:
                    output = "Queen";
                    break;
                case 14:
                    output = "King";
                    break;
            }
            // prints results
            System.out.printf("\tYou have a %s.\n", output);
            // increments amount per test
            amount++;
        }
    }
}