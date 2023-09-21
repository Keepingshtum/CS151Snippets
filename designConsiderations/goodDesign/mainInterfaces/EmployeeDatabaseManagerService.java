package designConsiderations.goodDesign.mainInterfaces;

import designConsiderations.goodDesign.mainClasses.Employee;

public interface EmployeeDatabaseManagerService {
    void saveToDatabase(Employee employee);

    Employee retrieveFromDatabase();
}
