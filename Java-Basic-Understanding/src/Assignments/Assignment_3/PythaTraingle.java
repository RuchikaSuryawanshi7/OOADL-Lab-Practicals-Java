package Assignments.Assignment_3;

import java.util.Scanner;

//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
// A Java program that returns true if there is a Pythagorean
// Triplet in a given array.
import java.io.*;

class PythaTriangle {

    // Returns true if there is Pythagorean triplet in ar[0..n-1]
    static boolean isTriplet(int ar[], int n)
    {
        // int ar[] = { 3, 1, 4, 6, 5 };
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Calculate square of array elements
                    int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }

        // If we reach here, no triplet found
        return false;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int ar[] = { 3, 1, 4, 6, 5, 9, 19 };
        int ar_size = ar.length;
        if (isTriplet(ar, ar_size) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

