package Assignments.Assignment_2;

import java.util.Scanner;

//Compound Interest Java Program
//Compound Interest = P(1 + R/100)t
public class In_CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount, Rate and Time...");
        float P = input.nextFloat();
        float R = input.nextFloat();
        float T = input.nextFloat();
        float compoundInterest = (float) (P * (Math.pow((1 + R/100),T)));
        System.out.println("Compound Interest is: "+ compoundInterest);

    }
}
