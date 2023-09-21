package designConsiderations.goodDesign.mainClasses;

import designConsiderations.goodDesign.mainInterfaces.EmployeeSalaryCalculatorService;

public class EmployeeSalaryCalculator implements EmployeeSalaryCalculatorService {
    @Override
    public double calculateGrossSalary(Employee employee) {
        // Code to calculate employee salary
        // Example implementation:
        return employee.getSalary();
    }

    @Override
    public double calculateNetSalary(Employee employee) {
        return employee.getSalary() - employee.getDeductions();
    }
}
