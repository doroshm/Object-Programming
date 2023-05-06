//imports Scanner so we can use it
import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args) {
        // new Scanner object is created
        Scanner in = new Scanner(System.in);
        // prompts user to type the amount of inputs they want to type
        System.out.print("How many numbers do you want to input? ");
        int inputs = in.nextInt();
        // while loop is created that tests if the inputs is less 0
        while (inputs < 0) {
            // prints error messege and asks for new input
            System.out.print("ERROR! Should be positive. Reenter: ");
            inputs = in.nextInt();
        }
        // prompts user to type in their integers
        System.out.printf("Now enter %d integers:\n", inputs);
        // calls method to calculate if the integer is odd or even
        oddEven(inputs, in);
    }

    public static void oddEven(int inputs, Scanner in) {
        //sets odds and evens to 0 for start
        int odds = 0;
        int evens = 0;
        //sets the amount to 0 for start
        int amount = 0;
        //while loop is created to keep going until inputs = amount based on the users input
        while (amount != inputs) {
            int integer = in.nextInt();
            //tests if integer is between 0 - 100
            while (integer < 0 || integer > 100) {
                //prompts to reenter integer if it does fall within the range
                System.out.print("ERROR! Valid range 0 - 100. Reenter: ");
                integer = in.nextInt();
            }
            //basic if statement is created to test odd and even then increments respectively
            if (integer % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
            //increments amount until it equals inputs
            amount++;
        }
        //prints final result
        System.out.printf("You entered %d odd numbers and %d even numbers.", odds, evens);
    }
}