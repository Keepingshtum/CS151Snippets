package objectClass.toString;


public class EmployeeReportGenerator implements EmployeeReportGeneratorService {
    @Override
    public void generateReport(Employee employee) {
        EmployeeSalaryCalculator employeeSalaryCalculator = new EmployeeSalaryCalculator();
        // Code to generate an employee report
         String report = "Employee Name: " + employee.getName() + "\n";
         report += "Employee ID: " + employee.getId() + "\n";
         report += "Salary Before Deductions: " + employeeSalaryCalculator.calculateGrossSalary(employee) + "\n";
         report += "Salary After Deductions:" + employeeSalaryCalculator.calculateNetSalary(employee);
        // // Add more report details as needed
        // // Write the report to a file or display it
        System.out.println(report);
    }
}
