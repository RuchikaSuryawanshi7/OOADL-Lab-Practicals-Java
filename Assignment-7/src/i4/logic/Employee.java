package i4.logic;

public class Employee extends Person{
    double salary;
    public Employee(String name,double salary) {
        super(name);
        this.salary = salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }

    @Override
    public void DiplayDetails() {
        System.out.println("Employee name: "+ this.getName());
        System.out.println("Employee salary: "+ this.getSalary());
    }
}
