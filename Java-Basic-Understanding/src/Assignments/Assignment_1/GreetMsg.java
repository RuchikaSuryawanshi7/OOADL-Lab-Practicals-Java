import java.util.Scanner;

//Take name as input and print a greeting message for that name.
public class GreetMsg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = input.nextLine();
        System.out.println("Welcome To world of Coding "+ name);
    }
}
