package Assignments.Assignment_2;

import java.util.Scanner;

//LCM Of Two Numbers
public class In_LCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two no: ");
        int no1 = input.nextInt(); //12
        int no2 = input.nextInt(); //16
        int lcm = 0;
        int gcd = 0;
        for(int i = 2; i<= no1 && i<= no2; i++){
            if (no1 % i == 0 && no2 % i == 0){
                gcd = i;
                break;
            }
        }
        lcm = (no1*no2) /gcd;
        System.out.println("LCM is: " +lcm);


    }
}
