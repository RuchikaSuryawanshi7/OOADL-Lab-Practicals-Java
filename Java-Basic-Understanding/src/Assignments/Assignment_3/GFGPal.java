package Assignments.Assignment_3;

import java.util.Objects;

public class GFGPal {
    static int isDigitSumPalindrome(int N) {
        int sum = sumdigit(N);
        int cmp = sum;
        int pal = 0;
        while(sum != 0){
            int rem = sum % 10;
            pal = (pal * 10) + rem;
            sum = sum / 10;
        }

        if(Objects.equals(cmp, pal)){
            return 1;
        }else{
            return 0;
        }

    }
    static int sumdigit(int N){
        int sum = 0;
        while( N != 0){
            int rem = N % 10;
            sum += rem;
            N =  N/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int N = 56;
        isDigitSumPalindrome(N);

    }
}
