package designConsiderations.goodDesign.mainClasses;

import java.util.ArrayList;
import java.util.List;

//Ideally, we want to create an Interface for the Department class too
//For the sake of time, I have left the creation of the related interfaces to the reader.

public class Department {
    private String name;
    private final List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void getAllEmployeesReports() {
        System.out.println("Employees in " + name + " Department:");
        EmployeeReportGenerator employeeReportGenerator = new EmployeeReportGenerator();
        for (Employee employee : employees) {
            employeeReportGenerator.generateReport(employee);
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
