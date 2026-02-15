package dsa_practice.arrays.two_sum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input1 = new int[]{2,7,11,15};
        int [] input2 = new int[]{3,2,4};
        int[] output1 = Solution.twoSumBruteForce(input2,6);
        int[] output2 = Solution.twoSum(input2,6);
        System.out.println(Arrays.toString(output1));
        System.out.println(Arrays.toString(output2));
    }
}
