package objectClass.toString;

import objectClass.toString.Employee;

public interface EmployeeSalaryCalculatorService {
    double calculateGrossSalary(Employee employee);

    double calculateNetSalary(Employee employee);
}
