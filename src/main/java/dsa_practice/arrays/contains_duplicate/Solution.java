package dsa_practice.arrays.contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean containsDuplicate1(int[] nums) {
        HashMap<Integer,Integer> map  =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> n: map.entrySet()){
            if(n.getValue()>1){
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        HashMap<Integer,Integer> map  =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}
