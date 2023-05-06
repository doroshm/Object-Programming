
//imports Scanner so we can use it within the code
import java.util.Scanner;

public class Assg2 {
    // declares 2 constants for today's day and month
    public static final int tdyMonth = 2;
    public static final int tdyDay = 14;

    public static void main(String[] args) {
        // creats a new scanner
        Scanner in = new Scanner(System.in);

        // prints introduction messege
        introduction();

        // 2 variables are declared to be able to use them later and passes the person's
        // # and scanner as parameters
        int prs1 = input(1, in);
        int prs2 = input(2, in);

        // method is created to show which person's bday is sooner
        sooner(prs1, prs2);

        // prints personal birthday fact
        fact();

        // closes scanner to not wait for new inputs from user
        in.close();
    }

    // method for introduction messege
    public static void introduction() {
        System.out.println(
                "This program compares two birthdays\nand displays which one is sooner.\nToday is 2/14/2023, day #45 of the year.\n");
    }

    public static int input(int person, Scanner in) {
        // requests input for user
        System.out.printf("Person %d:\nWhat month and day were you born? ", person);
        // stores person's month and day
        int month = in.nextInt();
        int day = in.nextInt();
        // method is called to print absolute day of person's birthday
        day(month, day);
        // method is called to print next birthday for said person
        bday(month, day);
        // returns next birthday to main method
        return bdayMath(month, day);
    }

    public static void day(int month, int day) {
        // declares an absolute variable that uses a method to make the calculation
        int absolute = absolute(month, day);

        // prints results
        System.out.printf("%d/%d/2023 falls on day #%d of 365.\n", month, day, absolute);
    }

    public static int absolute(int month, int day) {
        // sets absolute to 0 which will be the sum of days from start of year to
        // person's birthday
        int absolute = 0;
        // loop is created that loops through the person's months
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    // adds 31 to absolute based on these specific cases
                    absolute += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    // adds 30 to absolute based on these specific cases above after break
                    absolute += 30;
                    break;
                default:
                    // defaults to 28 because there is only 1 month that has only 28 days
                    absolute += 28;
            }
        }
        // returns the total sum + day back to the day method
        return absolute + day;
    }

    public static void bday(int month, int day) {
        // a variable is declared that calculates the amount of days left until the
        // persons's next birthday
        int prsDaysLeft = bdayMath(month, day);

        // if statement that decides what the correct output should be
        if (prsDaysLeft == 0) {
            System.out.println("Happy Birthday!\n");
        } else {
            System.out.printf("Your next birthday is in %d day(s).\n", prsDaysLeft);
            // declares double of the amount of days in a year to allow calculation with
            // integer
            double year = 365;
            // prints and calculates percentage
            System.out.printf("That is %.1f percent of a year away.\n\n", (prsDaysLeft / year * 100));
        }
    }

    public static int bdayMath(int month, int day) {
        // declares absolute for both today and person's birthday
        int tdyAbsolute = absolute(tdyMonth, tdyDay);
        int prsAbsolute = absolute(month, day);

        if (tdyAbsolute == prsAbsolute) {
            // returns 0 because today is the person's birthday
            return 0;
        } else if (tdyAbsolute < prsAbsolute) {
            // if person's birthday is greater than today than basic subtraction is needed
            return (prsAbsolute - tdyAbsolute);
        } else {
            // additional mathematics is needed to account for the loop around the remaining
            // days in a year
            return (365 - tdyAbsolute + prsAbsolute);
        }
    }

    public static void sooner(int prs1, int prs2) {
        if (prs1 == prs2) {
            // when both variables are equal to each other than it means they share the same
            // birthday
            System.out.println("Wow, you share the same birthday!\n");
        } else {
            // if else statement is created that decides which person's birthday comes
            // sooner
            int sooner = (prs1 < prs2) ? 1 : 2;
            System.out.printf("Person %d's birthday is sooner.\n\n", sooner);
        }
    }

    public static void fact() {
        //prints my birthday fact
        System.out.println("Did you know? 8/27 is National Banana Lovers Day!");
    }
}
