package designConsiderations.goodDesign.mainClasses;

import designConsiderations.goodDesign.mainInterfaces.EmployeeDatabaseManagerService;

public class EmployeeDatabaseManager implements EmployeeDatabaseManagerService {
    @Override
    public void saveToDatabase(Employee employee) {
        // Code to save employee data to the database
//         DatabaseConnection.openConnection();
//         DatabaseConnection.save(employee);
//         DatabaseConnection.closeConnection();
    }

        @Override
        public Employee retrieveFromDatabase() {
        // Code to retrieve employee data to the database
        // This method is responsible for database operations
//         DatabaseConnection.openConnection();
//         DatabaseConnection.get(employee);
//         DatabaseConnection.closeConnection();

            return new Employee("",0,0,0);
    }

}
