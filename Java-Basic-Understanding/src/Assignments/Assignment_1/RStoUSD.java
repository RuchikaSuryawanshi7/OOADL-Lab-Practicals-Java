//Input currency in rupees and output in USD.

import java.util.Scanner;

public class RStoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Rupees to convert in USD");
        float Rupee = input.nextFloat();
        float usd = (float) (Rupee / 74.60);
        System.out.println("USD is: "+ usd);
        System.out.println("Enter USD to convert in Rupee");
        float dollar = input.nextFloat();
        float inr = (float) (dollar * 74.60);
        System.out.println("INR is: "+ inr);

    }
}
