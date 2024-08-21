public class FullTimeEmployee extends Employee{
    private double allowance;
    private double bonus;

    FullTimeEmployee(int employeeId, String name, double basicSalary, double allowance, double bonus) {
        super(employeeId, name, basicSalary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.getSalary() + this.allowance + this.bonus;
    }

    @Override
    public void display() {
        System.out.println("***Full-Time Employee ***");
        super.display();
    }
}
