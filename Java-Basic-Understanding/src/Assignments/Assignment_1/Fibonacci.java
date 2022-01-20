package Assignments.Assignment_1;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int no = input.nextInt();
        int no1 = 0;
        int no2 = 1;
        int no3;
        int count = 2;
//        System.out.print(no1+","+no2);
//
//        for (int i = 2; i<no; ++i){
//            int num = no1+no2;
//            System.out.print(","+num);
//            no1= no2;
//            no2= num;
//        }

        while (count<=no){
            int temp = no2;
            no2 = no2 + no1;
            no1 = temp;
            count++;
            //System.out.println(no2);
        }
        System.out.println(no2);

    }
}
