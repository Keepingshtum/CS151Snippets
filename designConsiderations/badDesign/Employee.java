package designConsiderations.badDesign;

public class Employee implements EmployeeService {
    private String name;
    private int id;
    private double salary;

//    private double deductions;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

//    public double getDeductions() {
//        return deductions;
//    }
//
//    public void setDeductions(double deductions) {
//        this.deductions = deductions;
//    }
//
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public void saveToDatabase() {
        // Code to save employee data to the database
        // This method is responsible for database operations
//         DatabaseConnection.openConnection();
//         DatabaseConnection.save(employee);
//         DatabaseConnection.closeConnection();
    }

//    public void retrieveFromDatabase() {
//        // Code to retrieve employee data to the database
//        // This method is responsible for database operations
////         DatabaseConnection.openConnection();
////         DatabaseConnection.get(employee);
////         DatabaseConnection.closeConnection();
//    }

    @Override
    public double calculateSalary() {
        // Code to calculate employee salary
        // This method is responsible for salary calculations
        return this.getSalary();
    }

    //Violates Consistency - confusing Naming
    public String calculateSalary(boolean isString){
        if(isString) {
            return this.getSalary() + " ";
        }
        return "String isn't True!";
    }

    public double calculateNetSalary() {
        // Code to calculate employee salary
        // This method is responsible for salary calculations
//        return this.getSalary() - this.getDeductions();
        return this.getSalary();
    }

    @Override
    public void generateReport() {
        // Code to generate an employee report
        // This method is responsible for report generation
        String report = "Employee Name: " + this.getName() + "\n";
        report += "Employee ID: " + this.getId() + "\n";
        report += "Salary: " + this.calculateSalary() + "\n";
        // // Add more report details as needed
        // // Write the report to a file or display it
//        report += "Salary After Deductions" +this.calculateNetSalary();
        System.out.println(report);
    }

    //Violates Convenience AND Consistency AND Clarity
    public void myCoolMethod(String Name, String id, String Salary) {

        String report = "Some weird text here: " + Name + "\n";
        report += "Salary: " + Salary + "\n";
        report += "Employee ID: " + id + "\n";
        System.out.println(report);
    }
}
