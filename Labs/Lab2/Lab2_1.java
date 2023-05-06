public class Lab2_1 {
    public static void main(String[] args) {
        int x = 135;
        System.out.print("First number is " + x + ". "); // prints the first int
        int y = 30;
        System.out.print("Second Number is 30.\n"); // prints the second int
        modulo(x, y); // uses a method to display a modular by passing x,y
        divisionInt(x, y); // uses a method to display division using integers by passing x,y
        divsionFloat(x, y); // uses a method to display division using floats by passing x,y
    }

    // prints x, y, and modular using int
    public static void modulo(int x, int y) {
        System.out.println(x + " modulo " + y + " equals " + (x % y));
    }

    // prints x, y and division using an integers
    public static void divisionInt(int x, int y) {
        System.out.println(x + " divided by " + y + " equals " + (x / y) + " using integer division");
    }

    // prints x, y and division using a floats
    public static void divsionFloat(int x, int y) {
        System.out.println(x + " divided by " + y + " equals " + ((float) x / y) +
                " using floating-point division");

    }
}