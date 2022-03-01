//https://leetcode.com/problems/shuffle-the-array/
package Array;

public class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        // Solution 1
        int [] form = new int[nums.length];
        int pointer1 = 0;
        int pointer2 = 1;
        for(int i=0; i<n; i++){
            form[pointer1] = nums[i];
            form[pointer2] = nums[i+n];
            pointer1 = pointer1 + 2;
            pointer2 = pointer2 + 2;
        }
        return form;
        //Solution 2
        // int[] res = new int[2*n];
        // int j = 0;
        // for(int i = 0; i<res.length; i+=2) {
        //     res[i] = nums[j];
        //     res[i + 1] = nums[j + n];
        //     j++;
        // }
        // return res;


    }
}
