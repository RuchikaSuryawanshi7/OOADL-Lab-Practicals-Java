package Assignments.Assignment_2;
//Calculate Distance Between Two Points
import java.util.Scanner;

public class In_DistancePoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Point 1:");
        float point1 = input.nextFloat();
        System.out.println("Enter Point 2:");
        float point2 = input.nextFloat();
        float distance = Math.abs(point1 - point2);
        System.out.println("Distance is: "+ distance);

    }
}
