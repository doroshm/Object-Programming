public class Assg1_3 {
    // declares a constant for the height of the halves / 2
    public static final int HEIGHT = 3;

    public static void main(String[] args) {
        // prints line using the HEIGHT as a parameter
        line(HEIGHT);
        // prints top half of figure
        topHalf();
        line(HEIGHT);
        // prints bottom half of figure
        bottomHalf();
        line(HEIGHT);
    }

    public static void topHalf() {
        // uses a loop to print the figures twice
        for (int j = 0; j < 2; j++) {
            /*
             * uses a loop to run through each line using the HEIGHT as an outer-
             * limit,
             * incrementing
             */
            for (int i = 1; i <= HEIGHT; i++) {
                // prints vertical bar
                System.out.print("|");
                /*
                 * method is created to print the outer spaces from the ^ and uses
                 * the i as a
                 * parameter
                 */
                outerSpace(i);
                System.out.print("^");
                // similarly to outerSpace()
                innerSpace(i);
                System.out.print("^");
                outerSpace(i);
                System.out.print("|");
                // forces code to move to another line
                System.out.println();
            }
        }
    }

    public static void bottomHalf() {
        // uses a loop to print the figures twice
        for (int j = 0; j < 2; j++) {
            /*
             * uses a loop to run through each line using the HEIGHT as a lower-
             * limit,
             * decrementing
             */
            for (int i = HEIGHT; i >= 1; i--) {
                // similar to the topHalf() but uses a "v" instead
                System.out.print("|");
                outerSpace(i);
                System.out.print("v");
                innerSpace(i);
                System.out.print("v");
                outerSpace(i);
                System.out.print("|");
                System.out.println();
            }
        }
    }

    public static void outerSpace(int i) {
        // uses a loop to print spaces using a formula for each line
        for (int j = 1; j <= i * -1 + HEIGHT; j++) {
            System.out.print(" ");
        }
    }

    public static void innerSpace(int i) {
        // similar to outerSpace() but using a different formula
        for (int j = 1; j <= i * 2 - 2; j++) {
            System.out.print(" ");
        }
    }

    public static void line(int width) {
        // prints left side "+"
        System.out.print("+");
        // uses a loop to print "-"
        for (int i = 0; i < width * 2; i++) {
            System.out.print("-");
        }
        // prints right side "+" and forces code to a new line
        System.out.print("+\n");
    }
}