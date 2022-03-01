package i4.client;

import i4.logic.Employee;
import i4.logic.Person;
import i4.logic.Student;

public class Test {
    public static void main(String[] args) {
        Person emp1 = new Employee("Aman",121797);
        Person emp2 = new Employee("Roy",182698);
        Person emp3 = new Employee("Saif",7618378);
        emp1.DiplayDetails();
        emp2.DiplayDetails();
        emp3.DiplayDetails();
        Person stud1 = new Student("Ruchika");
        stud1.DiplayDetails();
        Person stud2 = new Student("Sara");
        Person stud3 = new Student("Mayan");

    }
}
