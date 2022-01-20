package Assignments.Assignment_2;
//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class In_KunalEvenMonthDAy {
    public static void main(String[] args) {
        int monthDay = 31;
        int count = 0;
        while (monthDay != 0){
            if(monthDay % 2 == 0){
                count += 1;
            }
            --monthDay;
        }
        System.out.println("Kunal can go out for "+ count+ " days");
    }
}
