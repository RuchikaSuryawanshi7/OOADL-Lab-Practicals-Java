package Array;

public class HowManyNumbersSmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] results = new int[nums.length];
        //int count;
        for(int i=0; i<nums.length; i++){
            //count = 0;
            for(int j=0; j<nums.length; j++){
                if(j != i && nums[j] < nums[i]){
                    //count += 1;
                    results[i]++;
                }
            }
            //results[i] = count;
        }
        return results;
    }
}
