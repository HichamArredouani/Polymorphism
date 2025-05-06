public abstract class Employee {
    protected String name;
    protected String employeeId;
    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public abstract double calculateSalary();
}
