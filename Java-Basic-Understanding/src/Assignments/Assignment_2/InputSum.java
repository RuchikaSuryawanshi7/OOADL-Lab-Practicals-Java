package Assignments.Assignment_2;

import java.util.Scanner;


public class InputSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        boolean bol = true;
        while (bol){
            System.out.println("Enter Number");
            int no = input.nextInt();
            sum += no;
            if(no ==0){
                break;
            }

        }
        System.out.println("Sum of all entered number "+sum);
    }
}
