package Assignments.Assignment_2;

import java.util.Scanner;

public class NumberOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = input.nextInt();
        System.out.println("Enter number to find its occurence");
        int searchNum = input.nextInt();
        int count = 0;
        while (num > 0){
            int rem = num%10;
            //System.out.println(rem);
            if(rem == searchNum){
                count++;
            }
            //System.out.println();
            num = num/10;
        }
        System.out.println("Number"+ searchNum +"is occured "+ count+ " times.");
    }
}
