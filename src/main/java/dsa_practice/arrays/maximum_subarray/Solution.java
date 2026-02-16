package dsa_practice.arrays.maximum_subarray;

public class Solution {

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        for(int n=1;n< nums.length;n++){
            if(sum<0) sum = 0;
            sum = sum + nums[n];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

}
