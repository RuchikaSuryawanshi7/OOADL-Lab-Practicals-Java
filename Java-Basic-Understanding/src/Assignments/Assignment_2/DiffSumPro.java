package Assignments.Assignment_2;

public class DiffSumPro {
    public static void main(String[] args) {
        int n = 234;
        int sum = 0;
        int product = 1;
        while(n != 0){
            int rem = n % 10;
            product *= rem;
            sum += rem;
            n = n / 10;
        }
        int diff = sum - product;
        System.out.println(Math.abs(diff));

    }
}
