package Assignments.Assignment_3;

import java.util.Scanner;
//Define a method to find out if a number is prime or not.
// Prime no is the number is only divisble by 1 or by the number itself
// 2 is also a prime ( exceptional case )
public class Prime {
    static void PrimeCheck(int no){

        if(no >= 0){
            if(no == 2){
                System.out.println("It is a Prime Number!!");
            }if(no == 1 || no == 0){
                System.out.println("It is not Prime!!");
            }
            for (int i=3; i <= no; i++){
                if(no % i == 0){
                    System.out.println("It is not a prime no");
                }
                System.out.println("It is a prime no");

            }
        }else {
            System.out.println("Please enter a positive no");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = input.nextInt();
        PrimeCheck(no);

    }
}
