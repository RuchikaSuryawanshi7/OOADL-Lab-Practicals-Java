package Assignments.Assignment_2;

import java.util.Scanner;

//Calculate CGPA Java Program
public class In_CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float marks;
        float sum = 0;
        int subject = 5;
        while (subject != 0){
            System.out.println("Enter no");
            marks = input.nextFloat();
            sum += marks;
            System.out.println(sum);
            --subject;
        }
        System.out.println("CGPA is: "+ sum / 5.0);
    }
}
