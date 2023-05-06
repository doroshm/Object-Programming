public class BusinessAccount extends Account {
    public BusinessAccount() {
        super();
    }

    public BusinessAccount(String name, String account, String phone, String ssn, double balance) {
        super(name, account, phone, ssn, balance);
    }

    public char getType() {
        return 'B';
    }
}
