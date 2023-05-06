public class CheckingAccount extends Account {
    public CheckingAccount() {
        super();
    }

    public CheckingAccount(String name, String account, String phone, String ssn, double balance) {
        super(name, account, phone, ssn, balance);
    }

    public double getInterest() {
        return getBalance() + (getBalance() * 0.025);
    }

    public char getType() {
        return 'C';
    }
}
