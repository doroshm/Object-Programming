import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        // prints introduction messege to user so they know what to type
        System.out.println("Please enter in order!");
        System.out.print("Enter test 1 score, test 2 score, assignments score, final score: ");
        Scanner in = new Scanner(System.in);
        // all the values from the user are declared as their own doubles and printed to
        // user
        double test1 = in.nextDouble();
        System.out.println("The student's test 1 score is " + test1);
        double test2 = in.nextDouble();
        System.out.println("The student's test 2 score is " + test2);
        double assign = in.nextDouble();
        System.out.println("The student's assignment score is " + assign);
        double finalScore = in.nextDouble();
        System.out.println("The student's final score is " + finalScore);
        in.close();
        // prints a messege and then summons a method to calculate the average
        System.out.println("The student's total score is " + calculateAverage(test1, test2, assign, finalScore));
    }

    public static double calculateAverage(double test1, double test2, double assign, double finalScore) {
        // a totalScore is declared which calculates the average and returns in to the
        // "System.out.println()"
        double totalScore = 0.15 * test1 + 0.15 * test2 + 0.30 * assign + 0.40 * finalScore;
        return totalScore;
    }
}