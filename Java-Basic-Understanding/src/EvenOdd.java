import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number...");
        int no = input.nextInt();
        if(no % 2 == 0){
            System.out.println("No is Even!!");
        }else {
            System.out.println("No is Odd!!");
        }

    }
}
