public class Lab2_3 {
    // declares a constant for the height
    public static final int height = 5;

    public static void main(String[] args) {
        // equation for finding the width
        int width = height * 4 - 4;
        // declares an int for the starting amount of stars
        int stars = 0;
        // loop which uses the heights value for the outerbound
        for (int i = 0; i < height; i++) {
            forwardSlashes(width); // uses a method to print /
            stars(stars); // uses a method to print *
            backwardSlashes(width); // uses a method to print \
            stars += 8; // I can see the stars are incremented by 8
            width -= 4; // width is decremented by 4 because 4 stars per side

            System.out.println(); // forces code to print onto next line
        }
    }

    // method loop for prints /
    public static void forwardSlashes(int width) {
        for (int i = 0; i < width; i++) { // uses width as outerbound
            System.out.print("/");
        }
    }

    // method loop for prints *
    public static void stars(int stars) {
        for (int i = 0; i < stars; i++) { // uses stars as outerbound
            System.out.print("*");
        }

    }

    // method loop for prints \
    public static void backwardSlashes(int width) {
        for (int i = 0; i < width; i++) { // uses width as outerbound
            System.out.print("\\");
        }
    }
}