package objectClass.toString;

public class Driver {
    public static void main (String [] args) {
        Employee employee = new Employee("Anant",117 , 100000d , 1000d);

        EmployeeReportGenerator employeeReportGenerator = new EmployeeReportGenerator();

        Department department = new Department("Computer Science");

        //When you do not have toString overridden
        System.out.println(employee);
        //Remember, if you have toString defined, we can get away with not even using .toString!
        System.out.println(department.toString());
        System.out.println(department);
    }
}
