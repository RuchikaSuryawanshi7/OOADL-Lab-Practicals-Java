package i4.logic;

public class Student extends Person{
    int roll;
    int year;
    public Student(String name) {
        super(name);
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getRoll(){
        return this.roll;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }

    @Override
    public void DiplayDetails() {
        System.out.println("Student name is: "+ this.name);
        System.out.println("Student roll no is: "+ this.roll);
        System.out.println("Student studying year is: "+ this.year);
    }
}
