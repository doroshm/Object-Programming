public class Account {
    private String name;
    private String account;
    private String phone;
    private String ssn;
    private double balance;

    public Account() {
        this("", "", "", "", 0);
    }

    public Account(String name, String account, String phone, String ssn, double balance) {
        this.name = name;
        this.account = account;
        this.phone = phone;
        this.ssn = ssn;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public String getPhone() {
        return phone;
    }

    public String getSSN() {
        return ssn;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return getBalance();
    }

    public char getType() {
        return 'A';
    }

    public void printInfo() {
        System.out.printf("Name: %s\nSSN: %s\nPhone Number: %s\nType: %c\n\nAccount Number: %s\nOpen Balance: %.2f\nClose Balance: %.2f\n\n", 
        name, 
        ssn, 
        phone, 
        getType(), 
        account,
        balance,
        getInterest());
    }
}
