//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class LargeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No 1");
        int no1 = input.nextInt();
        System.out.println("Enter no 2");
        int no2 = input.nextInt();
        if (no1 > no2){
            System.out.println(no1+" is greater than "+ no2);
        }else {
            System.out.println(no2+" is greater than "+ no1);
        }
    }
}
