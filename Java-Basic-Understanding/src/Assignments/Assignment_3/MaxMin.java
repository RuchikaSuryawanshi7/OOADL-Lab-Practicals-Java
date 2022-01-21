package Assignments.Assignment_3;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively
// among three numbers entered by the user.
public class MaxMin {
    static int findLargest(int no1, int no2, int no3){
        int max = Math.max(no1, no2);
        if(max > no3){
            return  max;
        }else {
            max = no3;
            return max;
        }
    }
    static int findSmallest(int no1, int no2, int no3){
        int min = Math.min(no1, no2);
        if(min < no3){
            return min;
        }else {
            min = no3;
            return min;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no 1:");
        int no1 = input.nextInt();
        System.out.println("Enter no 2:");
        int no2 = input.nextInt();
        System.out.println("Enter no 3:");
        int no3 = input.nextInt();
        System.out.println("Largest number is: "+ findLargest(no1, no2, no3));
        System.out.println("Smallest number is: "+ findSmallest(no1, no2, no3));

    }
}
