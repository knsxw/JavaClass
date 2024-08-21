public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int employeeId, String name, double basicSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return this.hourlyRate * this.hoursWorked;
    }

    @Override
    public void display() {
        System.out.println("***Part-Time Employee ***");
        super.display();
    }
}
