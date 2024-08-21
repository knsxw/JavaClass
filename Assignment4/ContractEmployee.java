public class ContractEmployee extends Employee{
    private int contractDuration;
    private double contractAmount;

    ContractEmployee(int employeeId, String name, double basicSalary, int contractDuration, int contractAmount) {
        super(employeeId, name, basicSalary);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return this.contractAmount / this.contractDuration;
    }

    @Override
    public void display() {
        System.out.println("***Contract Employee***");
        super.display();
    }
}
