package Assignments.Assignment_2;
//Calculate Discount Of Product

import java.util.Scanner;

public class In_Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Orignal Price");
        float originalPrice = input.nextFloat();
        System.out.println("Enter Selling Price");
        float sellingPrice = input.nextFloat();
        // Calculating discount
        float discount = originalPrice - sellingPrice;
        float disPercent = (discount / originalPrice) * 100;
        System.out.println("Your Product has "+disPercent+ " percent discount!");
    }
}
