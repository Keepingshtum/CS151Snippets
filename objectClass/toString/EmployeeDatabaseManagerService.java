package objectClass.toString;

import objectClass.toString.Employee;

public interface EmployeeDatabaseManagerService {
    void saveToDatabase(Employee employee);

    Employee retrieveFromDatabase();
}
