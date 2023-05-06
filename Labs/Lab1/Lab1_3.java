// ********************************************** 
// CSC 280                                 LAB #1 
// Marko Doroch                          01/31/23 
// PROGRAM-NAME: Lab1_3 
// Draw lanterns 
//*********************************************** 
public class Lab1_3 {
    // used three methods to keep it simple
    public static void main(String[] args) {
        Lantern1();
        Lantern2();
        Lantern3();
    }

    // prints empty line
    public static void emptyLine() {
        System.out.println();
    }

    // prints 5 stars
    public static void fiveStar() {
        System.out.println("    *****");
    }

    // prints 9 stars
    public static void nineStar() {
        System.out.println("  *********");
    }

    // prints 13 stars
    public static void thirteenStar() {
        System.out.println("*************");
    }

    // prints light
    public static void light() {
        System.out.println("* | | | | | *");
    }

    // prints cap of light using previous methods
    public static void cap() {
        fiveStar();
        nineStar();
        thirteenStar();
    }

    // prints out the first lantern
    public static void Lantern1() { 
        cap(); //I could have just added this to the second lantern, but I wanted to simplify it even more
        emptyLine();
    }

    // prints out the second lantern
    public static void Lantern2() {
        cap();
        light();
        thirteenStar();
        cap();
        emptyLine();
    }

    // prints out the third lantern
    public static void Lantern3() {
        cap();
        fiveStar();
        light();
        light();
        fiveStar();
        fiveStar();
    }
} // end of class Lab1_3