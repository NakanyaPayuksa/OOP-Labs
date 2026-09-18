package lab1;

public class EmployeeTeam {

    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Salary: " + employee.getMonthlySalary());
        System.out.println("---------------------------");
    }

    public void printAllEmployeesDetails() {
        System.out.println("--- All Employees Details ---");
        System.out.println("Boss: " + boss.getFirstName() + " " + boss.getLastName() + " | Salary: " + boss.getMonthlySalary());
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " | Salary: " + employee.getMonthlySalary());
        System.out.println("-----------------------------");
    }

    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        if (newSalary > 0) {
  
            if (boss.getFirstName().equals(firstname)) {
                boss.setMonthlySalary(newSalary);
            }

            if (employee.getFirstName().equals(firstname)) {
                employee.setMonthlySalary(newSalary);
            }
        }
    }

    public void giveRaiseToAllEmployees() {
        double currentBossSalary = boss.getMonthlySalary();
        boss.setMonthlySalary(currentBossSalary * 1.10);

        double currentEmpSalary = employee.getMonthlySalary();
        employee.setMonthlySalary(currentEmpSalary * 1.10);
    }
}