package Assignments.Assignment_3;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class VoterAge {
    static String Voter(int age){
        String confirm  = "";
        if(age > 0){
            if(age >= 18){
                confirm = "Yes";
            }else {
                confirm = "No";
            }
        }else {
            System.out.println("not valid Input Age");
        }

        return confirm;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = input.nextInt();
        System.out.println("Can I Vote: " + Voter(age));

    }
}
