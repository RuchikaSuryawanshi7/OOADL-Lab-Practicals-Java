package Assignments.Assignment_2;

import java.util.Scanner;

//Write a program to print the
// sum of negative numbers,
// sum of positive even numbers and
// the sum of positive odd numbers
// from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class In_NumberCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;
        while (true){
            System.out.println("Enter number");
            int no = input.nextInt();
           if( no == 0){
               System.out.println("Thank you!! ---- getting out of loop!!");
               break;
           }else {
               if(no < 0){
                   negativeSum += no;
               }else{
                   if(no % 2 == 0){
                       positiveEvenSum += no;
                   }else {
                       positiveOddSum += no;
                   }
               }
           }
        }
        System.out.println("Negative Number sum is: " + negativeSum);
        System.out.println("Positive Even Number sum is: " + positiveEvenSum);
        System.out.println("Positive Odd Number sum is: " + positiveOddSum);
    }
}
