abstract class Employee {
    private int employeeId;
    private String employeeName;

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int id) { employeeId = id; }
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String name) { employeeName = name; }

    abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;
    public void setMonthlySalary(double s) { monthlySalary = s; }
    public double calculateSalary() { return monthlySalary; }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public void setHoursWorked(int h) { hoursWorked = h; }
    public void setHourlyRate(double r) { hourlyRate = r; }
    public double calculateSalary() { return hoursWorked * hourlyRate; }
}

public class PayrollDemo {
    public static void main(String[] args) {
        FullTimeEmployee f = new FullTimeEmployee();
        f.setEmployeeId(1); f.setEmployeeName("Ankit"); f.setMonthlySalary(50000);

        PartTimeEmployee p = new PartTimeEmployee();
        p.setEmployeeId(2); p.setEmployeeName("Ravi"); p.setHoursWorked(80); p.setHourlyRate(200);

        f.displayEmployeeInfo(); System.out.println("Salary: " + f.calculateSalary());
        p.displayEmployeeInfo(); System.out.println("Salary: " + p.calculateSalary());
    }
}
