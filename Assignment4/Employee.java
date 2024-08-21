public class Employee {
    private int employeeId;
    private String name;
    private double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return this.basicSalary;
    }

    public double getSalary() {
        return this.basicSalary;
    }

    public void display() {
        System.out.println("Employee : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Actual Salary : " + this.calculateSalary());
        System.out.println();
    }
}
