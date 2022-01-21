package Assignments.Assignment_3;

import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail
public class Grade {
    static void Grader(int marks){
        if (marks >= 0 && marks <= 100) {
            if(marks >= 91 ){
                System.out.println("You got Grade AA");
            }else if (marks >= 81 ){
                System.out.println("You got Grade AB");
            }else if(marks >= 71){
                System.out.println("You got Grade BB");
            }else if (marks >= 61){
                System.out.println("You got Grade BC");
            }else if (marks >= 51 ){
                System.out.println("You got Grade CD");
            }else if (marks >= 41){
                System.out.println("You got Grade DD");
            }else {
                System.out.println("OPP'S you Failed!!");
            }
        } else {
            System.out.println("Enter Valid Marks out of 100");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks out of 100");
        int marks = input.nextInt();
        Grader(marks);

    }
}
