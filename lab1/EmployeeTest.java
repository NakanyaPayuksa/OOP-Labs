package lab1;

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Marin", "Sumsung", 3000.0);
        
        System.out.println("First Name: " + emp1.getFirstName());
        System.out.println("Last Name: " + emp1.getLastName());
        System.out.println("Monthly Salary: " + emp1.getMonthlySalary());

        emp1.setFirstName("Marin");
        emp1.setLastName("Sumsung");
        
        emp1.setMonthlySalary(-500.0);
        System.out.println("Salary after attempting negative value (-500): " + emp1.getMonthlySalary());

        emp1.setMonthlySalary(4000.0);
        System.out.println("Updated Monthly Salary: " + emp1.getMonthlySalary());

        System.out.println("-----------------------------------");

        Employee empA = new Employee("Marin", "Sumsung", 5000.0);
        Employee empB = new Employee("Fluke", "Dekde", 6000.0);

        System.out.println("Yearly Salary of Marin: " + empA.getYearlySalary());
        System.out.println("Yearly Salary of Fluke: " + empB.getYearlySalary());

        System.out.println("-----------------------------------");

        double newSalaryA = empA.getMonthlySalary() + (empA.getMonthlySalary() * 0.10);
        empA.setMonthlySalary(newSalaryA);

        double newSalaryB = empB.getMonthlySalary() + (empB.getMonthlySalary() * 0.10);
        empB.setMonthlySalary(newSalaryB);

        System.out.println("Yearly Salary of Somchai after 10% raise: " + empA.getYearlySalary());
        System.out.println("Yearly Salary of Somsri after 10% raise: " + empB.getYearlySalary());
    }
}