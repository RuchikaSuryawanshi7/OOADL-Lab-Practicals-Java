//https://leetcode.com/problems/concatenation-of-array/
package Array;

public class ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        //Solution 1
        // int[] ans = new int[2*nums.length];
        // for(int i = 0; i<(nums.length); i++){
        //     ans[i] = nums[i];
        //     if(ans.length >= nums.length){
        //         ans[i + nums.length] = nums[i];
        //     }
        // }
        //Solution 2
        int size = nums.length;
        int[] ans = new int[2 * nums.length];
        for(int i=0; i<size; i++){
            ans[i] = nums[i];
            ans[i+size] = nums[i];
        }
        return ans;

    }
}
