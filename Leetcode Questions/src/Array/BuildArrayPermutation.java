//https://leetcode.com/problems/build-array-from-permutation/
package Array;

public class BuildArrayPermutation {
    public int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for( int i = 0; i < nums.length; i++){
            newArray[i] = nums[nums[i]];
        }
        return newArray;

    }
}
