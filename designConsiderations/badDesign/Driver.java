package designConsiderations.badDesign;

public class Driver {
    public static void main (String [] args) {
        Employee employee = new Employee("Anant",117 , 100000d);
        employee.myCoolMethod("Anant","117" , "100000");
        employee.generateReport();

        Department department = new Department("Computer Science");
        department.addEmployee(employee);
        System.out.println(department.getEmployees());
        department.getAllEmployeesReport();
    }
}
