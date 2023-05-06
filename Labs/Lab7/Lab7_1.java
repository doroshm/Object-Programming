import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7_1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("Lab7_1_data.txt"));
            oddNumbers(in);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! " + e);
        }
    }

    public static void oddNumbers(Scanner in) {
        int sum = 0;
        int odds = 0;
        int total = 0;
 
        while (in.hasNext()) {
            try {
                int x = in.nextInt();
             
                sum += x;
                
                total++;
             
                if (x % 2 == 1) {
                    odds++;
                }
            } catch (InputMismatchException e) {
                in.next();
            }
        }
    
        double percent = (double) odds / total * 100;
       
        System.out.printf("%d numbers, sum = %d \n%d odds (%.2f%%)", total, sum, odds, percent);
    }
}