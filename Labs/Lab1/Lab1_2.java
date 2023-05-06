// ********************************************** 
// CSC 280                                 LAB #1 
// Marko Doroch                          01/31/23 
// PROGRAM-NAME: Lab1_2 
// Find and correct errors 
//*********************************************** 
public class Lab1_2 {
    /*
     * A program to display the text
     * on standard output screen
     */
    public static void main(String[] args) {
        System.out.println("The steps of the Secure Development Life Cycle are:");
        System.out.println(" 1. Analysis: Define the problem with security in mind."); // missing semi colon
        System.out.println(" 2. Design: Plane the solution with security in mind."); // missing paranthesis
        System.out.println(" 3. Implement: Code the solution with security in mind.");
        System.out.println(" 4. Test and debug with security in mind."); // misspelled println
        System.out.println(" 5. Maintain and Document with security in mind."); // forgot quotation mark
    }
} // end of class Lab1_2