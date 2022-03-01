package i4.client;

import i4.logic.Student;

public class Test {
    public static void main(String[] args) {
        Student student1 =new Student("Ruchika", 99, 98,95,84,85);
        student1.Average();
        Student student2 =new Student("Sara", 95, 88,85,84,95);
        student2.Average();
        Student student3 =new Student("Rohit", 99, 98,65,94,75);
        student3.Average();

    }
}
