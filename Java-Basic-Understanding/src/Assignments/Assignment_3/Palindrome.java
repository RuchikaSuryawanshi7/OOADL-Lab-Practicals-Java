package Assignments.Assignment_3;

import java.util.Scanner;

//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Palindrome {
    static void Palindrm(int num){
        int newno = 0;
        while (num != 0){
            int rem = num % 10;
            newno = (newno * 10) + rem;
            num = num/10;

        }
        if (newno == num){
            System.out.println(newno + " is a palindrome number");
        }else {
            System.out.println(newno + " is not a palindrome number");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No");
        int num = input.nextInt();
        Palindrm(num);

    }
}
