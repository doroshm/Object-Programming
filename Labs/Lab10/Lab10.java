//import relevant utilities
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        //create 3 points
        Point p1 = new Point();
        Point p2 = new Point(6, 8);
        Point p3 = new Point(6, 23);

        //uses a method to display the default values of p1
        defaultConstructor(p1);

        //uses method to display values of p2 and p4, and if they are horizontally or vertically equal
        alternateConstructor(p2, p3);
        vertically(p2, p3);
        horizontally(p2, p3);

        //create scanner object
        Scanner in = new Scanner(System.in);
        //uses methods to test if users input is either negative or non number
        int x = coordinate(in, 'x');
        int y = coordinate(in, 'y');
        //then replace p1's values
        p1.set(x, y);
        //and display values of p1 once again
        callToSet(p1);

        //methods for displays coordinates for x and y of p1
        callToGetX(p1);
        callToGetY(p1);

        //method used to calculate distance from origin for p1 and p2
        origin(p1, "P1");
        origin(p2, "P2");

        //method used to display distance between p1 and p2
        distanceBtw2Points(p1, p2);

        //method used to display translation of p1 and p2
        movePoint(5, 10, "P1", p1);
        movePoint(15, 5, "P2", p2);

        //method to check if p1 and p2 are equal to each other
        twoPointsEqual("Call to equals", p1, p2);

        //method which calculates slope between p1 and p2, then displays results
        callToSlope(p1, p2);

        //method used to display if the copy from one point to another was done correctly
        callToCopy(p1, p2);

        //then test if p1 and p2 are equal
        twoPointsEqual("Call to equals after call to copy", p1, p2);

        //declare a new Point and use the values from p3, then display results
        Point p4 = p3.getCopy();
        callToGetCopy(p3, p4);

        //finally test if they are equal to each other once more
        twoPointsEqual("Call to equals after call to getCopy", p3, p4);
    }

    public static void callToGetCopy(Point p3, Point p4) {
        System.out.println("\n---Call to getCopy with P3 to create P4---\n---Call to print---");

        System.out.print("P3 (after call to getCopy) is ");
        p3.print();
        System.out.print("\nP4 (after call to getCopy) is ");
        p4.print();

        System.out.println();
    }

    public static void callToCopy(Point p1, Point p2) {
        System.out.println("---Call to copy to make a copy of p1 in p2---\n---Call to print---");
        p2.copy(p1);

        System.out.print("P1 (after call to copy) is ");
        p1.print();
        System.out.print("\nP2 (after call to copy) is ");
        p2.print();

        System.out.println();
    }

    public static void callToSlope(Point p1, Point p2) {
        System.out.printf("---Call to slope: The slope of the line between P1 and P2 = %.2f\n\n", p1.slope(p2));
    }

    public static void twoPointsEqual(String start, Point p1, Point p2) {
        if (p1.equals(p2)) {
            System.out.printf("---%s: The 2 points are equal.\n", start);
        } else {
            System.out.printf("---%s: The 2 points are NOT equal.\n", start);
        }
    }

    public static void movePoint(int dx, int dy, String pos, Point p1) {
        p1.translate(dx, dy);
        System.out.printf("%s (after call to translate(%d,%d)) is %s\n", pos, dx, dy, p1);
    }

    public static void distanceBtw2Points(Point p1, Point p2) {
        System.out.printf("distance between P1 and P2 = %.2f\n", p1.distance(p2));
    }

    public static void origin(Point p1, String pos) {
        System.out.printf("distance from origin for %s = %.2f\n", pos, p1.distanceFromOrigin());
    }

    public static void callToGetY(Point p1) {
        System.out.printf("---Call to getY: The y-coordinate of P1 is %d\n", p1.getY());
    }

    public static void callToGetX(Point p1) {
        System.out.printf("---Call to getX: The x-coordinate of P1 is %d\n", p1.getX());
    }

    public static void callToSet(Point p1) {
        System.out.printf("P1 (after call to set) is %s\n", p1);
    }

    public static int coordinate(Scanner in, char pos) {
        //request users input
        System.out.printf("Enter the %c-coordinate for P1: ", pos);

        //declares user input to 0
        int test = 0;

        //while an input exists continue
        while (in.hasNext()) { // true
            //if the users input is not an integer, start from beginning and ask to reenter
            if (!(in.hasNextInt())) {
                System.out.printf("Not an integer: Try again! Enter the %c-coordinate for P1: ", pos);
                in.next();
                continue;
            }

            //redeclares user's input 
            test = in.nextInt();

            //tests if the users input is negative and starts from beginning
            if (test < 0) {
                System.out.printf("ERROR! Should be positive. Enter the %c-coordinate for P1: ", pos);
                continue;
            }

            //uses break to stop while loop if all tests have been passed
            break;
        }

        return test;
    }

    public static void horizontally(Point p2, Point p3) {
        if (p2.isHorizontal(p3)) {
            System.out.printf("P2 %s is horizontally aligned with P3 %s\n\n", p2, p3);
        } else {
            System.out.printf("P2 %s is not horizontally aligned with P3 %s\n\n", p2, p3);
        }
    }

    public static void vertically(Point p2, Point p3) {
        if (p2.isVertical(p3)) {
            System.out.printf("P2 %s is vertically aligned with P3 %s\n", p2, p3);
        } else {
            System.out.printf("P2 %s is not vertically aligned with P3 %s\n", p2, p3);
        }
    }

    public static void alternateConstructor(Point p2, Point p3) {
        System.out.println("---Call to the alternate constructor---");
        System.out.printf("---Using toString to print: P2 is %s\n", p2);
        System.out.printf("---Using toString to print: P3 is %s\n", p3);
    }

    public static void defaultConstructor(Point p1) {
        System.out.println("---Call to the default constructor---");
        System.out.printf("---Using toString to print: P1 is %s\n\n", p1);
    }
}
