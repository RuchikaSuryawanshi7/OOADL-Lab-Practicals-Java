package i4.logic;

import java.util.Scanner;

public class Quiz {


    private int totalStudents;
    private int marksObtained[];
    private int maxMarks;

    public void addMarks() {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Total number of students: ");
        this.totalStudents=sc.nextInt();

        this.marksObtained=new int[this.totalStudents];

        System.out.print("Enter the maximum marks of the quiz conducted: ");
        this.maxMarks=sc.nextInt();

        System.out.println("Enter the marks obtained by the students: ");

        for(int i=0;i<this.marksObtained.length;i++) {
            this.marksObtained[i]=sc.nextInt();
        }

        sc.close();
    }


    public void displayDetails() {
        System.out.println();
        System.out.println("\t\t\t\t*Quiz Details*");
        System.out.println("Total no of Students who attempted Quiz :" + this.totalStudents);
        System.out.println("Maximum Marks of Quiz : " + this.maxMarks);
        System.out.println("Marks Obtained By Student in Quiz : ");

        for(int i=0;i<marksObtained.length;i++) {
            System.out.println(marksObtained[i]);
        }

        System.out.println();

    }
}
