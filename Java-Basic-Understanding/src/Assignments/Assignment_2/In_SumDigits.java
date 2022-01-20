package Assignments.Assignment_2;

import java.util.Scanner;

//Sum Of A Digits Of Number
public class In_SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0){
            int rem = num % 10;
            sum += rem;
            num = num/10;
        }
        System.out.println("Sum of Digits of all Integer is: "+sum);
    }
}
