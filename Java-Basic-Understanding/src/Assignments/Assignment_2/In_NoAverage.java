package Assignments.Assignment_2;

import java.util.Scanner;

//Calculate Average Of N Numbers
public class In_NoAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No of Inputs to be entered");
        int noInput = input.nextInt();
        int no;
        int avg = 0;
        while (noInput > 0){
            System.out.println("Enter no:");
            no = input.nextInt();
            avg += no;
            //System.out.println(avg);
            --noInput;

        }
        System.out.println("Average of Number is " + avg);

    }
}
