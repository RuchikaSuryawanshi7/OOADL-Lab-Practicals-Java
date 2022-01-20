package Assignments.Assignment_2;
//nCr = n!/r!(n-r)!
//nPr = n!/(n-r)!

public class In_NprNcr {
    public static void main(String[] args) {
        int n = 10; // 5
        int r = 4; //3
        //fact(5);
        float NCR = (fact(n)) / (fact(r)*fact(n-r));
        float NPR = fact(n) / fact(n-r);
        System.out.println("NCR is: " + NCR);
        System.out.println("NPR is: " + NPR);

    }

    public static int fact(int val) {
        int fact = 1;
        for(int i = 1; i<val; i++){
            fact += (fact * i);
        }
        return fact;
    }
}
