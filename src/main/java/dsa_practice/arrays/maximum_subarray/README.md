# Maximum Subarray

## LeetCode
- Problem: https://leetcode.com/problems/maximum-subarray/description/
- Submission: https://leetcode.com/problems/maximum-subarray/submissions/1920677148/

## What to do
Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

## Input
- `nums = [-2,1,-3,4,-1,2,1,-5,4]`

## Output
- `6`

## Approach (my words)
I solved this using Kadane’s Algorithm (one pass):

- I keep two variables:
    - `sum` = current running sum of the subarray
    - `maxSum` = maximum subarray sum found so far
- I traverse the array from index 1:
    - If the current `sum` becomes negative, it will only decrease future sums, so I reset it to `0`.
    - Then I add the current element to `sum`.
    - Update `maxSum` with the maximum of `maxSum` and `sum`.
- Finally, return `maxSum`.

This works because if a running sum is negative, starting fresh from the next element gives a better chance to get a maximum sum.

## Complexity
- Time: `O(n)`
- Space: `O(1)`

## Pitfalls & Edge cases
- All numbers negative → answer is the largest (least negative) element  
  Example: `[-8,-3,-6,-2,-5,-4]` → `-2`
- Single element array  
  Example: `[5]` → `5`
- Array with zeros  
  Example: `[0,0,0]` → `0`
- Contiguous subarray only (not allowed to pick scattered elements)

## Test cases
1) Input: `nums = [-2,1,-3,4,-1,2,1,-5,4]` → Output: `6`
2) Input: `nums = [1]` → Output: `1`
3) Input: `nums = [5,4,-1,7,8]` → Output: `23`
4) Input: `nums = [-1,-2,-3]` → Output: `-1`
5) Input: `nums = [0,0,0]` → Output: `0`  
