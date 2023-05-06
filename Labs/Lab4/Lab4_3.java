import java.util.*;

public class Lab4_3 {
    public static void main(String[] args) {
        // introduction messege
        System.out.print("Please enter four numbers: ");
        Scanner in = new Scanner(System.in);
        // declares every possible input
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        in.close();
        // prints results and including a method with specific parameters
        System.out.println("Max(" + a + ", " + b + ") = " + max(a, b));
        System.out.println("Max(" + a + ", " + b + ", " + c + ") = " + max(a, b, c));
        System.out.println("Max(" + a + ", " + b + ", " + c + ", " + d + ") = " + max(a, b, c, d));
    }

    public static double max(double a, double b) {
        return a < b ? b : a; // standard if statement, returns larger number
    }

    public static double max(double a, double b, double c) {
        return max(max(a, b), c); // similar to the previous method but uses it twice to perform the operation
    }

    public static double max(double a, double b, double c, double d) {
        return max(max(a, b, c), d); // similar to the previous method but now includes a d parameter
    }
}