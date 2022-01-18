package i4;

public class Employee extends Person {
    private double salary;
    public Employee() {
        super();
    }
    public Employee(String name,Double salary) {
        super(name);
        this.salary=salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.print("Employee name: ");
        displayName();
        System.out.println("Salary:Rs"+this.salary);
    }
}
