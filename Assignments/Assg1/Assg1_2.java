public class Assg1_2 {
    public static void main(String[] args) {
        // declares an integer for amount of total change
        int change = 598;
        // prints total change
        System.out.println("The change is " + change);
        // declares an integer for the amount of half-dollars by dividing by 50
        int halfDollars = change / 50;
        // removes the half-dollars from the total change
        change -= halfDollars * 50;
        // prints total half-dollars
        System.out.println("Number of half-dollars: " + halfDollars);
        // declares an integer for the amount of quarters by dividing by 25
        int quarters = change / 25;
        // removes the quarters from the remaining change
        change -= quarters * 25;
        // prints total quarters
        System.out.println("Number of quarters: " + quarters);
        // declares an integer for the amount of dimes by dividing by 10
        int dimes = change / 10;
        // removes the dimes from the remaining change
        change -= dimes * 10;
        // prints total dimes
        System.out.println("Number of dimes: " + dimes);
        // declares an integer for the amount of nickels by dividing by 5
        int nickels = change / 5;
        // removes the nickels from the remaining change
        change -= nickels * 5;
        // prints total nickels
        System.out.println("Number of nickels: " + nickels);
        // prints the remaining change, which should just be pennies
        System.out.println("Number of pennies: " + change);
    }
}