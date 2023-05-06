public class Lab12Test1 {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "123456789");
        
        emp.printInfo(); 
        
        HourlyEmployee hemp = new HourlyEmployee("William Ford", "222334444");
        
        System.out.println("Name: " + hemp.getName());
        
        System.out.println("SSN: " + hemp.getSSN());
        
        SalariedEmployee semp = new SalariedEmployee();
        
        semp.changeName("Helen Drew");
        
        semp.changeSSN("321654879");
        
        semp.printInfo();
        
        System.out.println();
        
        Employee[] employees = { emp, hemp, semp };
        
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
