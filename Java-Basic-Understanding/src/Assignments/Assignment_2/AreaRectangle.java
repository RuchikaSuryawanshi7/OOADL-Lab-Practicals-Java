package Assignments.Assignment_2;

import java.util.Scanner;

//Area Of Rectangle Program
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length and Breath of Rectangle");
        int length = input.nextInt();
        int breath = input.nextInt();
        System.out.println("Area of Rectangle "+ length*breath);
    }
}
