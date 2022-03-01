package i4.logic;

public class Student {
    String studentName;
    int marks1;
    int marks2;
    int marks3;
    int marks4;
    int marks5;
    double average = 0;

    public Student(String studentName, int marks1, int marks2, int marks3, int marks4, int marks5) {
        this.studentName = studentName;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
        this.marks5 = marks5;
    }
    public void Average(){
        average = (marks1+marks2+marks3+marks4+marks5) / 5;
        System.out.println("Average of Student "+ studentName+ " is "+ average);

    }
}
