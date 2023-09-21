package designConsiderations.goodDesign.mainClasses;

import designConsiderations.badDesign.Department;

public class Driver {
    public static void main (String [] args) {
        Employee employee = new Employee("Anant",117 , 100000d , 1000d);

        EmployeeReportGenerator employeeReportGenerator = new EmployeeReportGenerator();
        employeeReportGenerator.generateReport(employee);

        Department department = new Department("Computer Science");
        department.getAllEmployeesReport();
    }
}
