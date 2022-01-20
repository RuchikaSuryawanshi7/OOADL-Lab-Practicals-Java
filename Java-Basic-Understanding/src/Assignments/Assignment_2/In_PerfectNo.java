package Assignments.Assignment_2;

import java.util.Scanner;

//Perfect Number In Java
public class In_PerfectNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        int sum = 0;
        for (int i = 1; i < no; i++){
            if(no % i == 0){
                sum += i;
            }
        }
        if(no == sum){
            System.out.println("No is Perfect Number!!");
        }else {
            System.out.println("Numbrr is not Perfect Number");
        }
    }
}
