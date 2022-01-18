package i4;

public class Student extends Person {
    private int rollNo;
    private int yearOfStudy;
    public Student() {
        super();
    }
    public Student(String myName, int rollNo, int
            yearOfStudy) {
        super(myName);
        this.rollNo = rollNo;
        this.yearOfStudy = yearOfStudy;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    public void displayDetails() {
        System.out.print("Student name: ");
        displayName();
        System.out.println("Roll number: " +
                this.rollNo);
        System.out.println("Year of Study: " +
                this.yearOfStudy);
    }
}