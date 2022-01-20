package Assignments.Assignment_2;

import java.util.Scanner;

//Check Leap Year Or Not
//year % 4 - T -- only check non-centuary leap year
// year % 100 - T --- centuary year as ending with 00
// year % 400 - T --- centuary is leap year only if it divisible by 400
public class In_LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if( year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Centuary Leap Year");
                }else {
                    System.out.println("Not Leap Year--");
                }
            }else {
                System.out.println("Not leap year**");
            }
            System.out.println("Leap years");
        }else {
            System.out.println("Not leap year//");
        }

    }
}
