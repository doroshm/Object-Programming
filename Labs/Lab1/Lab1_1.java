// ********************************************** 
// CSC 280                                 LAB #1 
// Marko Doroch                          01/31/23 
// PROGRAM-NAME: Lab1_1 
// Generate output 
//*********************************************** 
public class Lab1_1 {
    // "println" is used to output a value specified by the user, like a quote or even declared variables
    public static void main(String[] args) {
        System.out.println("This program prints a \nquote from Dr. Donald Knuth.\n"); //uses "\n" to go to a new line
        System.out.println("\"Computers are good at following \ninstructions, but not at reading your mind.\"\n"); //uses "\"" to be able to place quote marks
        System.out.println("A \"quoted\" String is \n\'much\' better if you learn \nthe rules of \"escape sequences\".\n"); // "\'" also allows us to use '' marks
        System.out.println("Also, \"\" represents an empty String.\nDon't forget: use \\\" instead of \" !\n\'\' is not the same as \""); // "\\" allows us to use slashes in text
    }
} // end of class Lab1_1