public class Main {
    public static void main(String[] args) {
        Employee employee1 = new PartTimeEmployee(1001,"David", 0.0, 10, 100);
        Employee employee2 = new FullTimeEmployee(1002, "Solomon", 5000, 0.0, 100);
        Employee employee3 = new ContractEmployee(1003, "Shiva", 0.0, 6, 60000);
        employee1.display();
        employee2.display();
        employee3.display();
    }
}
