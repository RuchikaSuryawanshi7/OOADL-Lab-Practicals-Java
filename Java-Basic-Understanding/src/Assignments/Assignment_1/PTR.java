import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
//principal P = Amount
//Rate R = rate
//Time T = years
public class PTR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal");
        double P = input.nextDouble();
        System.out.println("Enter Rate");
        float R = input.nextFloat();
        System.out.println("Enter time");
        float T = input.nextFloat();
        double SimpleInterest = (P*R*T) / 100;
        System.out.println("Simple Interest is "+ SimpleInterest);


    }
}
