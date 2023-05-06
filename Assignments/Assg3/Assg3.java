//import appropiate util and io
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Assg3 {
    //throws added to main method to ignore FileNotFoundException
    public static void main(String[] args) throws FileNotFoundException {
        //create new scanner
        Scanner console = new Scanner(System.in);
        //asks for a file name from user
        System.out.print("Enter file name: ");
        //store filename
        String filename = console.nextLine();
        //create new file for reading
        File file = new File(filename);

        //keeps checking if file exists
        while (!file.exists()) {
            //prompt user to enter a valid file name
            System.out.println("--- File Not Found! ---");
            System.out.print("Enter a correct file name: ");
            //store filename
            filename = console.nextLine();
            //recreates new file for reading
            file = new File(filename);
        }

        //stops console from receiving any more inputs
        console.close();

        //create a new scanner that read the file
        Scanner in = new Scanner(new File(filename));
        //passes scanner to a method
        generate(in);

    }

    //throws added to main method to ignore FileNotFoundException
    public static void generate(Scanner in) throws FileNotFoundException {
        //create an output file
        PrintStream out = new PrintStream(new File("output.txt"));
        //print the categories onto the output file
        out.printf("%-8s%-15s%-15s%-14s%-4s\n","Name","Position","Age Group","Annual Pay", "Code");
        
        //while the file still has information continue reading
        while (in.hasNextLine()) {
            //declare a line
            String line = in.nextLine();
            //create a scanner to read line
            Scanner lineScan = new Scanner(line);

            //initials
            out.printf("%-8s", lineScan.next());

            //position
            posType(lineScan.next().charAt(0), out);

            //age group
            ageGroup(lineScan.nextInt(), out);

            //annual pay
            out.printf("$%-13d", (int)(lineScan.nextDouble() * 2080));

            //license code
            int code = code(lineScan.nextInt());
            out.printf("%-4s\n", code);

            //stop scanner from scanning at the end
            lineScan.close();
        }

        //let the user know the new output file has been generated
        System.out.println("\nThe output.txt has been generated! Check, please.");
    }

    //determines the position
    public static void posType(char position, PrintStream out) {
        //declare empty output string
        String output = "";
        //test position by using a switch and redeclares output accordingly
        switch (position) {
            case 'A':
                output = "Management";
                break;
            case 'B':
                output = "Supervisor";
                break;
            case 'C':
                output = "Clerical";
                break;
            default:
                break;
        }

        //prints position onto output file
        out.printf("%-15s", output);
    }

    //determines the age group
    public static void ageGroup(int age, PrintStream out) {
        //declare empty output string
        String output = "";
        //determines the age group using if statement and redeclares output accordingly
        if (age > 65) {
            output = "Group 4";
        } else if (age <= 65 && age >= 41) {
            output = "Group 3";
        } else if (age <= 40 && age >= 25) {
            output = "Group 2";
        } else {
            output = "Group 1";
        }

        //prints age group onto output file
        out.printf("%-15s", output);
    }

    //dertermines the individual's license code
    public static int code(int license) {
        //declares starting code at 0
        int code = 0;
        
        //continues until license is 0
        while (license != 0) {
            //sums up each num in license 
            code += license % 10;
            license /=10;
        }
        
        //finally returns the code back to generate method
        return code;
    }
}
