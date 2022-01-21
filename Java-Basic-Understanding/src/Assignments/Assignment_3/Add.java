package Assignments.Assignment_3;

import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Add {
    static int Sum(int no1, int no2){
        return  no1 + no2;
    }static int Product(int no1, int no2){
        return  no1 * no2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No 1");
        int no1 = input.nextInt();
        System.out.println("Enter No 2");
        int no2 = input.nextInt();
        System.out.println("Addition of two numbers is " + Sum(no1, no2));
        System.out.println("product of two numbers is " + Product(no1, no2));

    }
}
