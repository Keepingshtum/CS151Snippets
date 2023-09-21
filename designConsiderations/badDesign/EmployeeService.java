package designConsiderations.badDesign;

//Violates Clarity
public interface EmployeeService {
    //Violates Cohesion
    void saveToDatabase();

    double calculateSalary();

    void generateReport();
}
