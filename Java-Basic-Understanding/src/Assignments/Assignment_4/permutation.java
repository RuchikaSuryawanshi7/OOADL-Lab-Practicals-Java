package Assignments.Assignment_4;

import java.util.Arrays;

public class permutation {
    public static int[] buildArray(int[] nums){
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(newArray));
        return  newArray;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        buildArray(nums);
    }
}

