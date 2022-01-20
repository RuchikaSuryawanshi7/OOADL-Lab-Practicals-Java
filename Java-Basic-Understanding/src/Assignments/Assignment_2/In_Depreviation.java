package Assignments.Assignment_2;

import java.util.Scanner;

public class In_Depreviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter Value, Rate, Time");
        float V = input.nextFloat();
        float R = input.nextFloat();
        float T = input.nextFloat();
        float D = (float) (V * Math.pow((1 - R/100), T));
        System.out.println("depreviation : "+ D);
    }
}
