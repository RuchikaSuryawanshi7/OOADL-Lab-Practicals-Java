package Assignments.Assignment_2;

import java.util.Scanner;

public class InputLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int large = 0;
        boolean bol = true;
        while (bol){
            System.out.println("Enter Number");
            int no = input.nextInt();
            if(no > large){
                large = no;
            }
            if(no ==0){
                break;
            }

        }
        System.out.println("Largest Number "+large);
    }
}

