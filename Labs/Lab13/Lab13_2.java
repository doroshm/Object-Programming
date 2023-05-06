
//import relevant utilities
import java.util.Scanner;
import java.util.ArrayList;

public class Lab13_2 {
    public static void main(String[] args) {
        // create scanner object
        Scanner in = new Scanner(System.in);
        // ask user if they want to start
        question("start");
        // declare response
        String yesNo = in.next();
        // continue while answer is yes
        while (yesNo.toLowerCase().charAt(0) == 'y') {
            // ask user for amount of nums
            System.out.print("How many integers do you want to enter: ");
            // check if it is negative or 0 and ask for reenter
            int k = check(in.nextInt(), in);
            // ask user to enter their integers
            System.out.println("Enter " + k + " integer(s):");
            // create arraylist
            ArrayList<Integer> list = new ArrayList<>();
            // add each integer to arraylist from user input
            for (int i = 0; i < k; i++) {
                list.add(in.nextInt());
            }
            // display their values through the list
            System.out.print("Integers enter in the ArrayList: " + list);
            copyByN(list);
            // display new list
            System.out.print("\nAfter calling the copyByN method, integers in the ArrayList: " + list + "\n\n");
            // ask user if they want to continue
            question("continue");
            // redeclare response
            yesNo = in.next();
        }
    }

    public static void copyByN(ArrayList<Integer> list) {
        // loop through each idx in list
        for (int i = 0; i < list.size(); i++) {
            // declare value at idx
            int n = list.get(i);
            // check if n is less than 1 and remove it
            // we have to go backwards bc we do not want to skip any nums
            // and continue
            if (n < 1) {
                list.remove(i);
                i--;
                continue;
            }
            // if we pass skip the if statement,
            // we can not add the values into the list
            // incrementing i as we add
            for (int j = 0; j < n - 1; j++) {
                list.add(i, n);
                i++;
            }
        }
    }

    public static int check(int k, Scanner in) {
        while (k < 1) {
            System.out.print("ERROR! Should be a positive integer. REENTER: ");
            k = in.nextInt();
        }
        return k;
    }

    public static void question(String word) {
        System.out.printf("Do you want to %s(Y/N): ", word);
    }
}
