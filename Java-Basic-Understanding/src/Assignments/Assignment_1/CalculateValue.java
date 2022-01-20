import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class CalculateValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no 1");
        int no1 = input.nextInt();
        System.out.println("Enter no 2");
        int no2 = input.nextInt();
        System.out.println("Enter Operation to perform");
        char operator = input.next().charAt(0);
        System.out.println("Answer is:");
        if(operator == '+'){
            System.out.println(no1 + no2);
        }else if (operator == '-'){
            System.out.println(no1 - no2);
        }else if (operator == '*'){
            System.out.println(no1 * no2);
        }else if (operator == '/'){
            System.out.println(no1 / no2);
        }else if (operator == '%'){
            System.out.println(no1 % no2);
        }else {
            System.out.println("Invalid Operator used!!");
        }



    }
}
