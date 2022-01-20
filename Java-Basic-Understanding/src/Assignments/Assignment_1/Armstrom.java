import java.util.Scanner;

//To find Armstrong Number between two given number.
public class Armstrom {
    public static void main(String[] args) {
        int number;
        int originalNumber, remainder, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to check whether it is Armstrom Number!!");
        number = input.nextInt();

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
            System.out.println(result);
        }
//        System.out.println(result);

        if (result == number){
            System.out.println(number + " is an Armstrong number.");
    }
        else{
            System.out.println(number + " is not an Armstrong number.");
        }

    }
}
