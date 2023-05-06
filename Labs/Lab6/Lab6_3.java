public class Lab6_3 {
    public static void main(String[] args) {
        // declares the starting address because the address has to be at least 1000
        int address = 1000;
        // declare found
        boolean found = false;
        // keep going while found is false
        while (!found) {
            // check if found using method
            found = decipher(address);

            // if found print results, otherwise increment
            if (found) {
                System.out.println(address + " Burke Avenue");
            } else {
                address++;
            }
        }
    }

    public static boolean decipher(int address) {
        // takes every integer within the address and declares them to their own
        // variable
        int d = address % 10;
        address /= 10;
        int c = address % 10;
        address /= 10;
        int b = address % 10;
        address /= 10;
        int a = address % 10;

        // checks if any of the digits are equal (may be a better way to do this?)
        // and returns false to stop the testing
        if (a == b || a == c || a == d || b == c || b == d || c == d) {
            return false;
        }

        // checks if the thousands place is not 3 times the tens place
        if (a != c * 3) {
            return false;
        }

        // checks if the sum is not equal to 27
        if (a + b + c + d != 27) {
            return false;
        }

        // checks if it is even
        if (d % 2 != 1) {
            return false;
        }

        // if the method passed all of the above statements this means the address has
        // been found
        return true;
    }
}
