package Assignments.Assignment_4;

public class RichestCustomer {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
                System.out.println(sum);
            }
            System.out.println("-----------");
            if(sum > max){
                max = sum;
                sum = 0;
            }else {
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [][] cus = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(maximumWealth(cus));


    }
}
