package Assignments.Assignment_4;

public class ConcateArray {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < 2 * nums.length; i++) {
            ans[i] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
