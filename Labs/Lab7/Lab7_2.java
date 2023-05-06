import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab7_2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("Lab7_2_data.txt"));
            showStatistics(in);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! " + e);
        }
    }

    public static void showStatistics(Scanner in) {
        int max = in.nextInt();
        int min = max;

        int sum = max;
        int total = 1;

        while (in.hasNext()) {
            int x = in.nextInt();

            sum += x;

            total++;

            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
        }

        double average = (double) sum / total;

        System.out.printf("Max: %d\nMin: %d\nAverage: %.2f", max, min, average);
    }
}