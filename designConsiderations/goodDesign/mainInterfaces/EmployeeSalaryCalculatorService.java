package designConsiderations.goodDesign.mainInterfaces;

import designConsiderations.goodDesign.mainClasses.Employee;

public interface EmployeeSalaryCalculatorService {
    double calculateGrossSalary(Employee employee);

    double calculateNetSalary(Employee employee);
}
