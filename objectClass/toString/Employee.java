package objectClass.toString;

public class Employee {
    private final String name;
    private final int id;
    private final double salary;

    private double deductions;

    public Employee(String name, int id, double salary, double deductions) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.deductions = deductions;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }
}

