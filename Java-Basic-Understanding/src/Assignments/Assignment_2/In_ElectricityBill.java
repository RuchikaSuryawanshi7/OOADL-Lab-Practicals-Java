package Assignments.Assignment_2;

import java.util.Scanner;

//Calculate Electricity Bill
// 0 - 100 unit = (units * 10)
//101 - 200 = (100 * 10)  + (units - 100) * 15
//201 - 300 = (100 * 10) + (100 * 15) + (units - 200) * 20
//300 and more = (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25
public class In_ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Units to calculate eclectricity bill: ");
        int units = input.nextInt();
        float electricBill = 0;
        if(units <= 100){
            electricBill = (units * 10);
        }else if (units > 100 && units <= 200){
            electricBill = (100 * 10) + (units - 100) * 15;
        }else if(units > 200 && units <= 300){
            electricBill = (100 * 10) + (100 * 15) + (units - 200) * 20;
        }else if (units > 300){
            electricBill = (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
        }else {
            System.out.println("Something Went Wrong Please try again!!");
        }
        System.out.println("Electricity Bill is " + electricBill);

    }
}
