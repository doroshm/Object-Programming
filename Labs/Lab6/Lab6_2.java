
//imports util so we can use the Scanner
import java.util.*;

public class Lab6_2 {
    public static void main(String[] args) {
        // creates Scanner
        Scanner in = new Scanner(System.in);

        // asks user for input
        question(1);

        // declares a string for the user's response
        String yesNo = in.next();

        // takes the char from the 1st index of yesNo and makes it lowercase
        // also checks if it's equal to 'y'
        while (yesNo.toLowerCase().charAt(0) == 'y') {
            // calls the method to flip a coin
            threeHeads();
            // asks user for input again
            question(2);

            // redeclares yesNo
            yesNo = in.next();
        }

        // stops awaiting new inputs
        in.close();
    }

    public static void question(int version) {
        // uses the parameter to check what question should be asked
        if (version == 1) {
            System.out.print("Would you like to start flipping a coin(Y/N): ");
        } else {
            System.out.print("Do you want to continue(Y/N): ");
        }
    }

    public static void threeHeads() {
        // creates random
        Random rand = new Random();

        // sets three in a row to false
        boolean three = false;

        // declares 2 variables to count the combos
        int comboHeads = 0;
        int comboTails = 0;

        // continues until three is true
        while (!three) {
            // flips coin
            int oneTwo = rand.nextInt(2) + 1;

            // checks if it is heads or tails
            if (oneTwo == 1) {
                // prints result
                System.out.print("H ");
                // increments heads
                comboHeads++;
                // resets tails
                comboTails = 0;
            } else {
                // similar to above statement
                System.out.print("T ");
                comboTails++;
                comboHeads = 0;
            }

            // checks if we have a three in a row
            if (comboHeads == 3) {
                // prints results
                System.out.println("\nThree heads in a row!\n");
                // sets three to true to stop while loop
                three = true;
            } else if (comboTails == 3) {
                // similar to above statement
                System.out.println("\nThree tails in a row!\n");
                three = true;
            }
        }
    }
}
