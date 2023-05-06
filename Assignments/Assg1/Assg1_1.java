public class Assg1_1 {
    // 3 methods are executed for the 3 different figures
    public static void main(String[] args) {
        figure1();
        figure2();
        figure3();
    }

    public static void figure1() {
        // uses a method to print 2 rows of stars
        twoRowfiveStar();
        // uses a method to print an X of stars
        X();
        // prints an empty line to show division between figures
        emptyLine();
    }

    public static void figure2() {
        twoRowfiveStar();
        X();
        twoRowfiveStar();
        emptyLine();
    }

    public static void figure3() {
        // uses 3 of the same methods to print individual stars
        oneStar();
        oneStar();
        oneStar();

        twoRowfiveStar();

        X();

        emptyLine();
    }

    public static void twoRowfiveStar() {
        // uses methods to print 5 stars twice
        fiveStar();
        fiveStar();
    }

    public static void X() {
        // uses 2 different methods to print an X shape of stars
        twoStar(); // <-- top half
        oneStar(); // <-- center
        twoStar(); // <-- bottom half
    }

    // all methods below have been explained previously
    public static void emptyLine() {
        System.out.println();
    }

    public static void fiveStar() {
        System.out.println("*****");
    }

    public static void twoStar() {
        System.out.println(" * * ");
    }

    public static void oneStar() {
        System.out.println("  *  ");
    }
}