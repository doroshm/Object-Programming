//imports Scanner so we can use it
import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        // creates Scanner object
        Scanner in = new Scanner(System.in);
        // prints introduction messege
        introduction();
        // loop is created so the user can type 4 days
        for (int i = 1; i <= 4; i++) {
            System.out.print("Please enter a date: ");
            // declares variables from user input for month and day
            int month = in.nextInt();
            int day = in.nextInt();
            // calls a method to return a string for the respected season
            String season = season(month, day);
            // prints results with season
            System.out.printf("The date is %d/%d, which is %s.\n\n", month, day, season);
        }
        // closes Scanner so it doesn't wait for new inputs
        in.close();
    }

    public static void introduction() {
        System.out.println("You will enter the date for times... ");
    }

    // method returns a string based on users month and day parameters
    public static String season(int month, int day) {
        // each if/if else statement contains 3 months with some extra guidelines
        if (month < 3 || (month == 3 && day <= 15)) {
            return "winter";
        } else if (month < 6 || (month == 6 && day <= 15)) {
            return "spring";
        } else if (month < 9 || (month == 9 && day <= 15)) {
            return "summer";
        } else if (month < 12 || (month == 12 && day <= 15)) {
            return "fall";
        } else {
            // the rest should just be winter
            return "winter";
        }
    }
}