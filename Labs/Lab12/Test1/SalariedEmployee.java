public class SalariedEmployee extends Employee {
    public SalariedEmployee() {
        super("", "");
    }

    public SalariedEmployee(String name, String ssn) {
        super(name, ssn);
    }

    public int getVacationDays() {
        return 15;
    }
}
