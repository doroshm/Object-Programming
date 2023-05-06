//import relevant utilities
import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        //create time objects
        Time t1 = new Time(9, 5, 9);
        Time t2 = new Time();

        //display initial values of t1 and t2 using a method
        initial(t1, "t1", "alternate");
        initial(t2, "t2", "default");
        //pass code to new line
        System.out.println();

        //set a new time for t2
        t2.setTime(11, 8, 12);
        //display the required new time, test if t1 and t2 are equal, and test if t1 is less than t2
        printSetTime(t2, "t2", 1);
        printEquals(t1, t2, "t1", "t2");
        printLessThan(t1, t2, "t1", "t2");

        //set a new time for t1
        t1.setTime(17, 8, 12);
        //display the required new time, test if t1 and t2 are equal, and test if t1 is less than t2 once again
        printSetTime(t1, "t1", 1);
        printEquals(t1, t2, "t1", "t2");
        printLessThan(t1, t2, "t1", "t2");

        //create Scanner object
        Scanner in = new Scanner(System.in);
        //ask user for input
        System.out.print("Enter hours, minutes, and seconds: ");
        //create new time for t1 by using user input
        t1.setTime(in.nextInt(), in.nextInt(), in.nextInt());
        //stop scanner from waiting for new inputs
        in.close();
        //display the new values of t1
        printSetTime(t1, "t1", 2);
        //display the the incremented version of t1
        printIncrementSecs(t1, "t1");
        //copy over t1 values to t2
        t2.copy(t1);
        //display results
        printCopy(t2, "t1", "t2");
        //test toString for t2
        printToString(t2, "t2");

        //create a new time object by copying the values from t1
        Time t3 = t1.getCopy();
        //display results of t3
        printGetCopy(t3, "t1", "t3");
        //display incremented version of t3
        printIncrementSecs(t3, "t3");
        //test toString for t3
        printToString(t3, "t3");
    }

    public static void initial(Time t, String name, String version) {
        System.out.printf("The initial time %s created using the %s constructor is shown in military format: ", name,
                version);
        t.printMilitary();
        System.out.println();
        System.out.printf("The initial time %s created using the %s constructor is shown in standard format: ", name,
                version);
        t.printStandard();
        System.out.println();
    }

    public static void printSetTime(Time t, String name, int version) {
        if (version == 1) {
            System.out.printf("%s after call to setTime - military format: ", name);
            t.printMilitary();
            System.out.println();
            System.out.printf("%s after call to setTime - standard format: ", name);
            t.printStandard();
            System.out.println();
        } else {
            System.out.printf("New time %s after call to setTime - standard format: ", name);
            t.printStandard();
            System.out.println();
            System.out.printf("New time %s after call to setTime - military format: ", name);
            t.printMilitary();
            System.out.println();
        }
    }

    public static void printEquals(Time t1, Time t2, String name1, String name2) {
        if (t1.equals(t2)) {
            System.out.printf("After call to equals: %s and %s are equal.\n", name1, name2);
        } else {
            System.out.printf("After call to equals: %s and %s are NOT equal.\n", name1, name2);
        }
    }

    public static void printLessThan(Time t1, Time t2, String name1, String name2) {
        if (t1.lessThan(t2)) {
            System.out.printf("After call to lessThan: %s is less than %s.\n\n", name1, name2);
        } else {
            System.out.printf("After call to lessThan: %s is NOT less than %s.\n\n", name1, name2);
        }
    }

    public static void printIncrementSecs(Time t, String name) {
        t.incrementSecs();
        System.out.printf("New time %s after call to incrementSecs - standard format: ", name);
        t.printStandard();
        System.out.println();
        System.out.printf("New time %s after call to incrementSecs - military format: ", name);
        t.printMilitary();
        System.out.println();
    }

    public static void printCopy(Time t2, String name1, String name2) {
        System.out.printf("New time %s after call to copy to make a copy of %s in %s - standard format: ", name2, name1,
                name2);
        t2.printStandard();
        System.out.println();
        System.out.printf("New time %s after call to copy to make a copy of %s in %s - military format: ", name2, name1,
                name2);
        t2.printMilitary();
        System.out.println();
    }

    public static void printToString(Time t, String name) {
        System.out.printf("Test toString for %s: %s\n\n", name, t);
    }

    public static void printGetCopy(Time t, String name1, String name2) {
        System.out.printf("After call to getCopy with %s to create new time %s - standard format: ", name1, name2);
        t.printStandard();
        System.out.println();
        System.out.printf("After call to getCopy with %s to create new time %s - military format: ", name1, name2);
        t.printMilitary();
        System.out.println();
    }
}
