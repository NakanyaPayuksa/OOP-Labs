package lab1;

public class EmployeeTeamTest {
    public static void main(String[] args) {
   
        Employee boss1 = new Employee("Marin", "Sumsung", 50000.0);
        Employee emp1 = new Employee("Fluke", "Dekde", 20000.0);

  
        EmployeeTeam team = new EmployeeTeam(boss1, emp1);

        System.out.println("=== Test Method 1 ===");
        team.printEmployeeDetails();

        System.out.println("=== Test Method 2 ===");
        team.printAllEmployeesDetails();

        System.out.println("=== Test Method 3 (Update Salary) ===");
        team.updateSalaryOfEmployee("Somsri", 25000.0); 
        team.printAllEmployeesDetails();

        System.out.println("=== Test Method 4 (Give 10% Raise) ===");
        team.giveRaiseToAllEmployees();
        team.printAllEmployeesDetails();
    }
}