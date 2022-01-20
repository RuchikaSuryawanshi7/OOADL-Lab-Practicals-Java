package Assignments.Assignment_2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = input.nextInt();
        int count = 0;
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            num = num/10;
            ans = ans *10 + rem;
        }
        System.out.println("Reverse is "+ans);
    }
}
