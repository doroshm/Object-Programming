import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        // introduction messege
        System.out.print("What is your name? ");
        Scanner in = new Scanner(System.in);
        // 2 of the same method are called for each different input: first name, last
        // name
        poem(in.next());
        poem(in.next());
        in.close();
    }

    public static void poem(String name) {
        // prints all the lines referenced by the sample outputs
        System.out.println(name + ", " + name + ", bo-B-" + name.substring(1, name.length()));
        System.out.println("Banana-fana fo-F-" + name.substring(1, name.length()));
        System.out.println("Fee-fi-mo-M-" + name.substring(1, name.length()));
        System.out.println(name.toUpperCase() + "!");
        System.out.println();
    }
}