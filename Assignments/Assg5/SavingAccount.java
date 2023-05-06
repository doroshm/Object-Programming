public class SavingAccount extends Account{
    public SavingAccount() {
        super();
    }

    public SavingAccount(String name, String account, String phone, String ssn, double balance) {
        super(name, account, phone, ssn, balance);
    }

    public double getInterest() {
        if (getBalance() < 5000) {
            return getBalance() + (getBalance() * 0.04);
        }

        return getBalance() + (getBalance() * 0.05);
    }

    public char getType() {
        return 'S';
    }
}
