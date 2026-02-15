package dsa_practice.arrays.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Solution {
    public static int[] twoSumBruteForce(int[] nums, int target){
        for(int i = 0;i<=nums.length-1;i++){
            int num1 = nums[i];

            for(int j=0;j<=nums.length-1;j++){
                int num2 = nums[j];

                if((num1+num2)==target&& i!=j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        for(int i=0;i< nums.length;i++){
            int x = target - nums[i];
            if(hashMap.containsKey(x)){
                return new int[]{hashMap.get(x),i};
            }else{
                hashMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
