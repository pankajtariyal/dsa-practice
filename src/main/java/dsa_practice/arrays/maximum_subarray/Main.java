package dsa_practice.arrays.maximum_subarray;


public class Main {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

        Solution solution = new Solution();
        int output = solution.maxSubArray(nums);
        System.out.println(output);
    }
}
