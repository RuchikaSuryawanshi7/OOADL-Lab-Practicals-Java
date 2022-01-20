package Assignments.Assignment_2;

import java.util.Scanner;

//HCF Of Two Numbers Program
public class In_HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two no: ");
        int no1 = input.nextInt(); //12
        int no2 = input.nextInt(); //16
        int nomin = Math.min(no1,no2);
        int nomax = Math.max(no1,no2);
        for (int i = nomin/2 ; nomin != 0; i--){
            if((nomin % i) == 0){
                if (nomax % i == 0){
                    System.out.println(i + " is the Highest Common Factor");
                    break;
                }
            }

        }
    }
}
