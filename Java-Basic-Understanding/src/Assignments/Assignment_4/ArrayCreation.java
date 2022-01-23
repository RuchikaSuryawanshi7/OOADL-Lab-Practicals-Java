package Assignments.Assignment_4;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int in = input.nextInt();
        int[] arr = new int[in];
        for (int i = 0; i<arr.length ; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Array Elements are:");
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Array Elements are:");

        for (int j: arr){
            System.out.println(j);
        }

    }
}
