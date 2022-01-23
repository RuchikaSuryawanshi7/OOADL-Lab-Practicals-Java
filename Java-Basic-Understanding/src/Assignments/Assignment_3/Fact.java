package Assignments.Assignment_3;

import java.util.Scanner;

//fact 5! = 1*2*3*4*5 = 120
public class Fact {
    static int Fact(int no){
        int fact = 1;
        int count = 1;
        while (count <= no){
            fact *= count;
            count++;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        Fact(num);

    }
}
