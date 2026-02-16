package dsa_practice.arrays.move_zeroes;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<=1) return;
        int slow = 0;
        int fast = 0;
        while (fast<nums.length){
            if(nums[fast]!=0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
    }
}