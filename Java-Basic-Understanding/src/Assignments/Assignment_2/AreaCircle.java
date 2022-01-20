package Assignments.Assignment_2;

import java.util.Scanner;

//Area Of Circle Java Program
public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius!!");
        float radius = input.nextFloat();
        float pie = 3.14F;
        System.out.println("Area of Circle with radius "+ radius + " is "+ pie*(radius*radius));

    }
}
