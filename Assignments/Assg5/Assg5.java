public class Assg5 {
    public static void main(String[] args) {
        BusinessAccount sam = new BusinessAccount("Sam", "78192222", "555-0498", "123-45-6789", 4500);
        CheckingAccount carla = new CheckingAccount("Carla", "74329832", "555-9812", "233-98-3831", 230);
        SavingAccount woody = new SavingAccount("Woody", "72872911", "555-9281", "823-23-0911", 5700);
        SavingAccount diane = new SavingAccount("Diane", "63672822", "555-9232", "212-11-0091", 2300);
        CheckingAccount norm = new CheckingAccount("Norm", "63672822", "555-2932", "918-22-0911", 7800);

        Account[] arr = { sam, carla, woody, diane, norm };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ".");
            stars();
            System.out.println("\t\tMonthly Bank Statement");
            arr[i].printInfo();
            note();
            stars();
            System.out.println();
        }
    }

    public static void note() {
        System.out.println(
                "Note:\nB = Business Account\nC = Checking Account\nS = Savings Account\n1. No interest on business accounts\n2. 2.5% interest on each checking account\n3. 4% interest on each savings account if the balance < $5000\n5% otherwise");
    }

    public static void stars() {
        for (int i = 0; i < 62; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
