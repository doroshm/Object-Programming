public class Employee {
    private String name;
    private String ssn;

    public Employee() {
        this("", "");
    }

    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSSN() {
        return ssn;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeSSN(String ssn) {
        this.ssn = ssn;
    }

    public int getVacationDays() {
        return 10;
    }

    public void printInfo() {
        System.out.print("Name: " + name + "\nSSN: " + ssn + "\n");
    }

    public String toString() {
        return name + ", " + ssn + ", " + getVacationDays();
    }
}
