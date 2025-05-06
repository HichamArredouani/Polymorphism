public class FullTimeEmployee extends Employee {
    private double annualSalary;
    public FullTimeEmployee(String name, String employeeId, double annualSalary) {
        super(name, employeeId);
        this.annualSalary = annualSalary;
    }
    @Override
    public double calculateSalary() {
        return annualSalary;
    }
}